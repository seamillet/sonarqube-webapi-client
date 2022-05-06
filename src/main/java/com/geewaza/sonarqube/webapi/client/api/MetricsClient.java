package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.metrics.GetMetricsTypesService;
import com.geewaza.sonarqube.webapi.api.metrics.SearchMetricsService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:22
 **/
public class MetricsClient extends AbstractSonarClient {
    public MetricsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public GetMetricsTypesService getMetricsTypes() {
        return new GetMetricsTypesService(this.httpClient);
    }
    public SearchMetricsService searchMetrics() {
        return new SearchMetricsService(this.httpClient);
    }
}
