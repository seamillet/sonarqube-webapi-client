package com.geewaza.sonarqube.webapi.api.measures;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasures;

import java.io.IOException;

/**
 * Return component with specified measures. The componentId or the component parameter must be provided.
 * Requires the following permission: 'Browse' on the project of specified component.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetComponentService extends AbstractService<GetComponentService, ComponentMeasures> {
    public GetComponentService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"metricKeys"};
    }

    @Override
    protected ComponentMeasures doExecute() throws IOException {
        return doGet("api/measures/component", ComponentMeasures.class);
    }

    public GetComponentService additionalFields(String... additionalFields) {
        return putCsvParam("additionalFields", additionalFields);
    }
    public GetComponentService metricKeys(String... metricKeys) {
        return putCsvParam("metricKeys", metricKeys);
    }
    public GetComponentService component(String component) {
        return put("component", component);
    }
}
