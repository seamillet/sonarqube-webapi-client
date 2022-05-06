package com.geewaza.sonarqube.webapi.api.projectanalyses;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a project analysis.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the project of the specified analysis
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class DeleteAnalysisService extends AbstractService<DeleteAnalysisService, Boolean> {
    public DeleteAnalysisService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"analysis"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_analyses/delete_event");
        return true;
    }

    public DeleteAnalysisService analysis(String analysis) {
        return put("analysis", analysis);
    }

}
