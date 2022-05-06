package com.geewaza.sonarqube.webapi.api.projectanalyses;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.AnalysisEventResponse;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class CreateEventService extends AbstractService<CreateEventService, AnalysisEventResponse> {
    public CreateEventService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"analysis", "name"};
    }

    @Override
    protected AnalysisEventResponse doExecute() throws IOException {
        return doPost("api/project_analyses/create_event", AnalysisEventResponse.class);
    }

    public CreateEventService analysis(String analysis) {
        return put("analysis", analysis);
    }
    public CreateEventService category(String category) {
        return put("category", category);
    }
    public CreateEventService name(String name) {
        return put("name", name);
    }

}
