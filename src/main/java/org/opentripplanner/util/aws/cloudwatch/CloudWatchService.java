package org.opentripplanner.util.aws.cloudwatch;

import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchAsync;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchAsyncClientBuilder;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;
import com.amazonaws.services.cloudwatch.model.PutMetricDataResult;
import org.opentripplanner.util.aws.cloudwatch.metrics.CloudWatchMetrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class CloudWatchService {

    private static final Logger _log = LoggerFactory.getLogger(CloudWatchService.class);

    private static volatile CloudWatchService instance;

    private boolean _enabled = true;

    private AmazonCloudWatchAsync _client;

    private AsyncHandler<PutMetricDataRequest, PutMetricDataResult> _handler;

    private CloudWatchService() {
        try {
            _client = AmazonCloudWatchAsyncClientBuilder.standard().build();
            _handler = new AsyncHandler<PutMetricDataRequest, PutMetricDataResult>() {
                @Override
                public void onError(Exception e) {
                    _log.error("Error sending to cloudwatch: " + e);
                }

                @Override
                public void onSuccess(PutMetricDataRequest request, PutMetricDataResult putMetricDataResult) {
                    // do nothing
                }
            };
        } catch(Exception e){
            _log.warn("Unable to connect to CloudWatch", e);
            _enabled = false;
        }
    }

    public boolean enabled(){
        return _enabled;
    }

    public void publishMetric(String nameSpace, CloudWatchMetrics cwMetrics) {
        if (!_enabled){
            _log.warn("CloudWatch not enabled.");
            return;
        }
        Set<MetricDatum> metrics = cwMetrics.getMetrics();
        PutMetricDataRequest request = new PutMetricDataRequest()
                .withMetricData(metrics)
                .withNamespace(nameSpace);
        _client.putMetricDataAsync(request, _handler);
    }

    public static CloudWatchService getInstance()
    {
        if(instance == null){
            synchronized (CloudWatchService.class) {
                if(instance == null){
                    instance = new CloudWatchService();
                }
            }
        }
        return instance;
    }

}
