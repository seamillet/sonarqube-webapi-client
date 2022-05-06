package com.geewaza.sonarqube.webapi.api.projectanalyses;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.AnalysisEventResponse;

import java.io.IOException;

/**
 * Update a project analysis event.
 * Only events of category 'VERSION' and 'OTHER' can be updated.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class UpdateEventService extends AbstractService<UpdateEventService, AnalysisEventResponse> {
    public UpdateEventService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"event", "name"};
    }

    @Override
    protected AnalysisEventResponse doExecute() throws IOException {
        return doPost("api/project_analyses/update_event", AnalysisEventResponse.class);
    }

    public UpdateEventService event(String event) {
        return put("event", event);
    }
    public UpdateEventService name(String name) {
        return put("name", name);
    }

}
