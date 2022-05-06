package com.geewaza.sonarqube.webapi.api.ce;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.ce.TaskStatus;

import java.io.IOException;

/**
 * Returns CE activity related metrics.
 * Requires 'Administer System' permission or 'Administer' rights on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:27
 **/
public class GetCeActivityStatusService extends AbstractService<GetCeActivityStatusService, TaskStatus> {
    public GetCeActivityStatusService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected TaskStatus doExecute() throws IOException {
        return doGet("api/ce/activity_status", TaskStatus.class);
    }

    public GetCeActivityStatusService componentId(String componentId) {
        return put("componentId", componentId);
    }

}

