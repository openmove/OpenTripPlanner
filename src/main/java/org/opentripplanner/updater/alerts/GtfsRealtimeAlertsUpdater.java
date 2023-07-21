package org.opentripplanner.updater.alerts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URI;

import com.fasterxml.jackson.databind.JsonNode;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.jets3t.service.S3Service;
import org.jets3t.service.impl.rest.httpclient.RestS3Service;
import org.jets3t.service.model.S3Object;
import org.jets3t.service.security.AWSCredentials;
import org.jets3t.service.security.GSCredentials;
import org.jets3t.service.security.ProviderCredentials;
import org.opentripplanner.routing.graph.Graph;
import org.opentripplanner.routing.impl.AlertPatchServiceImpl;
import org.opentripplanner.routing.services.AlertPatchService;
import org.opentripplanner.updater.GraphUpdaterManager;
import org.opentripplanner.updater.GraphWriterRunnable;
import org.opentripplanner.updater.GtfsRealtimeFuzzyTripMatcher;
import org.opentripplanner.updater.PollingGraphUpdater;
import org.opentripplanner.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.transit.realtime.GtfsRealtime.FeedMessage;

/**
 * GTFS-RT alerts updater
 *
 * Usage example ('myalert' name is an example) in file 'Graph.properties':
 *
 * <pre>
 * myalert.type = real-time-alerts
 * myalert.frequencySec = 60
 * myalert.url = http://host.tld/path
 * myalert.earlyStartSec = 3600
 * myalert.feedId = TA
 * </pre>
 */
public class GtfsRealtimeAlertsUpdater extends PollingGraphUpdater {
    private static final Logger LOG = LoggerFactory.getLogger(GtfsRealtimeAlertsUpdater.class);

    private GraphUpdaterManager updaterManager;

    private Long lastTimestamp = Long.MIN_VALUE;

    private String url;

    private String feedId;

    private GtfsRealtimeFuzzyTripMatcher fuzzyTripMatcher;

    private AlertPatchService alertPatchService;

    private long earlyStart;

    private AlertsUpdateHandler updateHandler = null;

    @Override
    public void setGraphUpdaterManager(GraphUpdaterManager updaterManager) {
        this.updaterManager = updaterManager;
    }

    @Override
    protected void configurePolling(Graph graph, JsonNode config) throws Exception {
        // TODO: add options to choose different patch services
        AlertPatchService alertPatchService = new AlertPatchServiceImpl(graph);
        this.alertPatchService = alertPatchService;
        String url = config.path("url").asText();
        if (url == null) {
            throw new IllegalArgumentException("Missing mandatory 'url' parameter");
        }
        this.url = url;
        this.earlyStart = config.path("earlyStartSec").asInt(0);
        this.feedId = config.path("feedId").asText();
        if (config.path("fuzzyTripMatching").asBoolean(false)) {
            this.fuzzyTripMatcher = new GtfsRealtimeFuzzyTripMatcher(graph.index);
        }
        LOG.info("Creating real-time alert updater running every {} seconds : {}", pollingPeriodSeconds, url);
    }

    @Override
    public void setup(Graph graph) {
        if (updateHandler == null) {
            updateHandler = new AlertsUpdateHandler();
        }
        updateHandler.setEarlyStart(earlyStart);
        updateHandler.setFeedId(feedId);
        updateHandler.setAlertPatchService(alertPatchService);
        updateHandler.setFuzzyTripMatcher(fuzzyTripMatcher);
    }

    @Override
    protected void runPolling() {
    	FTPClient ftpClient = new FTPClient();
    	InputStream data = null;
        try {
        	URI aURL = new URI(this.url);
        	
        	String protocol = aURL.getScheme();
        	
        	if(protocol.equals("ftp")) {
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
            	
                data = ftpClient.retrieveFileStream(remoteFile);
        	}else if(protocol.equals("s3")){
        		String bucketName = aURL.getHost();
        		String key = aURL.getPath();
        		String[] userAndPassword = aURL.getUserInfo().split(":");
                
                String accessKey = userAndPassword[0];
                String secretKey = userAndPassword[1];
                AWSCredentials credentials = new AWSCredentials(accessKey, secretKey);
        		
        		S3Service s3Service = new RestS3Service(credentials);
                S3Object object = s3Service.getObject(bucketName, key);

                data = object.getDataInputStream();
                
        	}else if(protocol.equals("gs")){
        		String bucketName = aURL.getHost();
        		String key = aURL.getPath();
        		String[] userAndPassword = aURL.getUserInfo().split(":");
                
                String accessKey = userAndPassword[0];
                String secretKey = userAndPassword[1];
                GSCredentials credentials = new GSCredentials(accessKey, secretKey);
        		
        		S3Service s3Service = new RestS3Service(credentials);
                S3Object object = s3Service.getObject(bucketName, key);

                data = object.getDataInputStream();
                
        	}else{
        		data = HttpUtils.getData(
	                url,
	                "Accept",
	                "application/x-google-protobuf, application/x-protobuf, application/protobuf, application/octet-stream, */*");
        	}
        	
            
            if (data == null) {
                throw new RuntimeException("Failed to get data from url " + url);
            }

            final FeedMessage feed = FeedMessage.PARSER.parseFrom(data);

            long feedTimestamp = feed.getHeader().getTimestamp();
            if (feedTimestamp <= lastTimestamp) {
                LOG.info("Ignoring feed with an old timestamp.");
                return;
            }

            // Handle update in graph writer runnable
            updaterManager.execute(new GraphWriterRunnable() {
                @Override
                public void run(Graph graph) {
                    updateHandler.update(feed);
                }
            });

            lastTimestamp = feedTimestamp;
        } catch (Exception e) {
            LOG.error("Error reading gtfs-realtime feed from " + url, e);
        } finally {
			 try {
				 if(data != null) {
					 try {
						 data.close();
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
    }

    @Override
    public void teardown() {
    }

    public String toString() {
        return "GtfsRealtimeUpdater(" + url + ")";
    }
}
