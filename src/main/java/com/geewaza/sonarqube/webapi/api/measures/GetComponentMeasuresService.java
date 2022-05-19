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
public class GetComponentMeasuresService extends AbstractService<GetComponentMeasuresService, ComponentMeasures> {
    public GetComponentMeasuresService(BaseHttpClient httpClient) {
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

    public GetComponentMeasuresService additionalFields(String... additionalFields) {
        return putCsvParam("additionalFields", additionalFields);
    }

    /**
     * Branch key. Not available in the community edition.
     *
     * @param branch    Example value:feature/my_branch
     * @return  GetComponentMeasuresService
     */
    public GetComponentMeasuresService branch(String branch) {
        return put("branch", branch);
    }

    public GetComponentMeasuresService metricKeys(String... metricKeys) {
        return putCsvParam("metricKeys", metricKeys);
    }
    public GetComponentMeasuresService component(String component) {
        return put("component", component);
    }

    /**
     * Pull request id. Not available in the community edition.
     * @param pullRequest   Example value:5461
     * @return  GetComponentMeasuresService
     */
    public GetComponentMeasuresService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }

}
