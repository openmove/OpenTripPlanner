package org.opentripplanner.updater.vehicle_positions;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.VehiclePosition;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.jets3t.service.S3Service;
import org.jets3t.service.impl.rest.httpclient.RestS3Service;
import org.jets3t.service.model.S3Object;
import org.jets3t.service.security.AWSCredentials;
import org.jets3t.service.security.GSCredentials;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Responsible for downloading GTFS-rt vehicle positions from a URL and loading into memory.
 */
public class GtfsRealtimeS3VehiclePositionSource implements VehiclePositionSource, JsonConfigurable {
    private static final Logger LOG =
            LoggerFactory.getLogger(GtfsRealtimeS3VehiclePositionSource.class);

    /**
     * FeedId the GTFS-RT feed is associated with
     */
    private String feedId;

    /**
     * URL to grab GTFS-RT feed from
     */
    private String url;

    @Override
    public void configure(Graph graph, JsonNode config) throws Exception {
        this.feedId = config.path("feedId").asText();
        String url = config.path("url").asText();
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' parameter");
        }
        this.url = url;
    }

    /**
     * Parses raw GTFS-RT data into vehicle positions
     */
    public List<VehiclePosition> getPositions() {
    	InputStream is = null;
    	List<VehiclePosition> updates = Collections.emptyList();;
        try{
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
            updates = this.getPositions(is);
            
        } catch (Exception e) {
            LOG.warn("Failed to parse gtfs-rt feed from {}:", url, e);
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
    public String getFeedId() {
        return this.feedId;
    }
}
