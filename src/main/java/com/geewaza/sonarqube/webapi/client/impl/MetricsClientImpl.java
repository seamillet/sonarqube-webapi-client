package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.MetricsClient;
import com.geewaza.sonarqube.webapi.model.measure.Metrics;
import com.geewaza.sonarqube.webapi.model.measure.Types;

import java.io.IOException;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:57
 **/
public class MetricsClientImpl extends AbstractSonarClient implements MetricsClient {
    public MetricsClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Search for metrics
     *
     * @param p  1-based page number
     * @param ps Page size. Must be greater than 0 and less or equal than 500
     * @return Metrics
     * @throws IOException IOException
     */
    @Override
    public Metrics searchMetrics(Integer p, Integer ps) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("p", p).put("ps", ps).build();
        return this.httpClient.get("api/metrics/search", params, Metrics.class);
    }

    /**
     * List all available metric types.
     *
     * @return Types
     * @throws IOException IOException
     */
    @Override
    public Types getTypes() throws IOException {
        return this.httpClient.get("api/metrics/types", null, Types.class);
    }
}
