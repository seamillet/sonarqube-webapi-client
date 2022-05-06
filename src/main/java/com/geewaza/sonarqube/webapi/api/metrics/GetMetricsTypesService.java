package com.geewaza.sonarqube.webapi.api.metrics;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.measure.Types;

import java.io.IOException;

/**
 * List all available metric types.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetMetricsTypesService extends AbstractService<GetMetricsTypesService, Types> {
    public GetMetricsTypesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Types doExecute() throws IOException {
        return doGet("api/metrics/types", Types.class);
    }
}
