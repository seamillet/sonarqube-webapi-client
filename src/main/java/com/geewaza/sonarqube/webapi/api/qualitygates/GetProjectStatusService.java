package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.ProjectStatusResponse;

import java.io.IOException;

/**
 * Get the quality gate status of a project or a Compute Engine task.
 * Either 'analysisId', 'projectId' or 'projectKey' must be provided
 * The different statuses returned are: OK, WARN, ERROR, NONE. The NONE status is returned when there is no quality gate associated with the analysis.
 * Returns an HTTP code 404 if the analysis associated with the task is not found or does not exist.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified project
 * 'Browse' on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class GetProjectStatusService extends AbstractService<GetProjectStatusService, ProjectStatusResponse> {
    public GetProjectStatusService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected ProjectStatusResponse doExecute() throws IOException {
        return doGet("api/qualitygates/project_status", ProjectStatusResponse.class);
    }

    public GetProjectStatusService analysisId(String analysisId) {
        return put("analysisId", analysisId);
    }

    public GetProjectStatusService branch(String branch) {
        return put("branch", branch);
    }

    public GetProjectStatusService projectId(String projectId) {
        return put("projectId", projectId);
    }

    public GetProjectStatusService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

    public GetProjectStatusService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }

}
