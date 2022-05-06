package com.geewaza.sonarqube.webapi.api.projectlinks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.ProjectLinks;

import java.io.IOException;

/**
 * List links of a project.
 * The 'projectId' or 'projectKey' must be provided.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified project
 * 'Browse' on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class SearchProjectLinksService extends AbstractService<SearchProjectLinksService, ProjectLinks> {
    public SearchProjectLinksService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected ProjectLinks doExecute() throws IOException {
        return doGet("api/project_links/search", ProjectLinks.class);
    }

    public SearchProjectLinksService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public SearchProjectLinksService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }


}
