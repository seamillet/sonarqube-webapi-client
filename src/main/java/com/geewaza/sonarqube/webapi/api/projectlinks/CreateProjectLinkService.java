package com.geewaza.sonarqube.webapi.api.projectlinks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.ProjectLinkResponse;

import java.io.IOException;

/**
 * Create a new project link.
 * Requires 'Administer' permission on the specified project, or global 'Administer' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class CreateProjectLinkService extends AbstractService<CreateProjectLinkService, ProjectLinkResponse> {
    public CreateProjectLinkService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name", "url"};
    }

    @Override
    protected ProjectLinkResponse doExecute() throws IOException {
        return doPost("api/project_links/create", ProjectLinkResponse.class);
    }

    public CreateProjectLinkService name(String name) {
        return put("name", name);
    }
    public CreateProjectLinkService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public CreateProjectLinkService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }
    public CreateProjectLinkService url(String url) {
        return put("url", url);
    }



}
