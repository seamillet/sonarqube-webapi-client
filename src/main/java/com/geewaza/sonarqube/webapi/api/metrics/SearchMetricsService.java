package com.geewaza.sonarqube.webapi.api.metrics;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.measure.Metrics;

import java.io.IOException;

/**
 * Get information on automatic metrics, and manage custom metrics. See also api/custom_measures.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class SearchMetricsService extends AbstractService<SearchMetricsService, Metrics> {
    public SearchMetricsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Metrics doExecute() throws IOException {
        return doGet("api/metrics/search", Metrics.class);
    }

    public SearchMetricsService p(Integer p) {
        return put("p", p);
    }
    public SearchMetricsService ps(Integer ps) {
        return put("ps", ps);
    }
}
