package org.opentripplanner.updater.vehicle_positions;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;
import com.google.transit.realtime.GtfsRealtime.VehiclePosition;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.updater.JsonConfigurable;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Responsible for downloading GTFS-rt vehicle positions from a URL and loading into memory.
 */
public class GtfsRealtimeFTPVehiclePositionSource implements VehiclePositionSource, JsonConfigurable {
    private static final Logger LOG =
            LoggerFactory.getLogger(GtfsRealtimeFTPVehiclePositionSource.class);

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
    	FTPClient ftpClient = new FTPClient();
    	InputStream is = null;
    	List<VehiclePosition> updates = Collections.emptyList();;
        try{
        	URL aURL = new URL(this.url);
        	
        	String server =  aURL.getHost();
            int port = aURL.getPort();
            
            if(port == -1) {
            	port = 21;
            }
            
            String[] userAndPassword = aURL.getUserInfo().split(":");
            
            String user = userAndPassword[0];
            String pass = userAndPassword[1];
            
            String remoteFile = aURL.getPath();
            
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            
            is = ftpClient.retrieveFileStream(remoteFile);
            updates = this.getPositions(is);
            
        } catch (Exception e) {
            LOG.warn("Failed to parse gtfs-rt feed from {}:", url, e);
        } finally {
       	 try {
       		if(is != null) {
				 try {
					 is.close();
				 }catch(IOException ex1) {
					 ex1.printStackTrace(); 
				 }
				 
			 }
       		
	        if (ftpClient.isConnected()) {
	            ftpClient.logout();
	            ftpClient.disconnect();
	        }
         } catch (IOException ex) {
             ex.printStackTrace();
         }
        } 
        return updates;
    }

    @Override
    public String getFeedId() {
        return this.feedId;
    }
}
