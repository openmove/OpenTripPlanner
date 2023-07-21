package org.opentripplanner.updater.stoptime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.jets3t.service.S3Service;
import org.jets3t.service.impl.rest.httpclient.RestS3Service;
import org.jets3t.service.model.S3Object;
import org.jets3t.service.security.AWSCredentials;
import org.jets3t.service.security.GSCredentials;
import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.TripUpdate;

public class GtfsRealtimeS3TripUpdateSource implements TripUpdateSource, JsonConfigurable {
    private static final Logger LOG =
            LoggerFactory.getLogger(GtfsRealtimeS3TripUpdateSource.class);

    /**
     * True iff the last list with updates represent all updates that are active right now, i.e. all
     * previous updates should be disregarded
     */
    private boolean fullDataset = true;

    /**
     * Feed id that is used to match trip ids in the TripUpdates
     */
    private String feedId;

    private String url;

    @Override
    public void configure(Graph graph, JsonNode config) throws Exception {
        String url = config.path("url").asText();
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' parameter");
        }
        this.url = url;
        this.feedId = config.path("feedId").asText();
    }

    @Override
    public List<TripUpdate> getUpdates() {
        FeedMessage feedMessage = null;
        List<FeedEntity> feedEntityList = null;
        List<TripUpdate> updates = null;
        fullDataset = true;
        
        InputStream is = null;
        
        try {
        	
        	URI aURL = new URI(this.url);
        	String protocol = aURL.getScheme();
        	if(protocol.equals("s3")){
        		String bucketName = aURL.getHost();
        		String key = aURL.getPath();
        		String[] userAndPassword = aURL.getUserInfo().split(":");
                
                String accessKey = userAndPassword[0];
                String secretKey = userAndPassword[1];
                AWSCredentials credentials = new AWSCredentials(accessKey, secretKey);
        		
        		S3Service s3Service = new RestS3Service(credentials);
                S3Object object = s3Service.getObject(bucketName, key);

                is = object.getDataInputStream();
                
        	}else if(protocol.equals("gs")){
        		String bucketName = aURL.getHost();
        		String key = aURL.getPath();
        		String[] userAndPassword = aURL.getUserInfo().split(":");
                
                String accessKey = userAndPassword[0];
                String secretKey = userAndPassword[1];
                GSCredentials credentials = new GSCredentials(accessKey, secretKey);
        		
        		S3Service s3Service = new RestS3Service(credentials);
                S3Object object = s3Service.getObject(bucketName, key);

                is = object.getDataInputStream();
                
        	}
            
            if (is != null) {
                // Decode message
                feedMessage = FeedMessage.PARSER.parseFrom(is);
                feedEntityList = feedMessage.getEntityList();
                
                // Change fullDataset value if this is an incremental update
                if (feedMessage.hasHeader()
                        && feedMessage.getHeader().hasIncrementality()
                        && feedMessage.getHeader().getIncrementality()
                                .equals(GtfsRealtime.FeedHeader.Incrementality.DIFFERENTIAL)) {
                    fullDataset = false;
                }
                
                // Create List of TripUpdates
                updates = new ArrayList<>(feedEntityList.size());
                for (FeedEntity feedEntity : feedEntityList) {
                    if (feedEntity.hasTripUpdate()) updates.add(feedEntity.getTripUpdate());
                }
            }
        } catch (Exception e) {
            LOG.warn("Failed to parse gtfs-rt feed from " + url + ":", e);
        } finally {
        	if(is != null) {
				 try {
					 is.close();
				 }catch(IOException ex1) {
					 ex1.printStackTrace(); 
				 }
				 
			 }
        }
        return updates;
    }

    @Override
    public boolean getFullDatasetValueOfLastUpdates() {
        return fullDataset;
    }
    
    public String toString() {
        return "GtfsRealtimeHttpUpdateStreamer(" + url + ")";
    }

    @Override
    public String getFeedId() {
        return this.feedId;
    }
}
