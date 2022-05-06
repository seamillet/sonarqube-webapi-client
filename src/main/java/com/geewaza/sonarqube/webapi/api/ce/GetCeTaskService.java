package com.geewaza.sonarqube.webapi.api.ce;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.ce.TaskResponse;

import java.io.IOException;

/**
 * Give Compute Engine task details such as type, status, duration and associated component.
 * Requires 'Administer System' or 'Execute Analysis' permission.
 * Since 6.1, field "logs" is deprecated and its value is always false.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:27
 **/
public class GetCeTaskService extends AbstractService<GetCeTaskService, TaskResponse> {
    public GetCeTaskService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"id"};
    }

    @Override
    protected TaskResponse doExecute() throws IOException {
        return doGet("api/ce/task", TaskResponse.class);
    }

    public GetCeTaskService id(String id) {
        return put("id", id);
    }
    public GetCeTaskService additionalFields(String... additionalFields) {
        return putCsvParam("additionalFields", additionalFields);
    }

}

