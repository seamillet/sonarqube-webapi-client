package com.geewaza.sonarqube.webapi.api.projects;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.ProjectResponse;

import java.io.IOException;

/**
 * Create a project.
 * Requires 'Create Projects' permission
 *
 * @author : wangheng
 * @date : 2022-05-03 23:24
 **/
public class CreateProjectService extends AbstractService<CreateProjectService, ProjectResponse> {
    public CreateProjectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name", "project"};
    }

    @Override
    protected ProjectResponse doExecute() throws IOException {
        return doPost("api/projects/create", ProjectResponse.class);
    }
    public CreateProjectService name(String name) {
        return put("name", name);
    }
    public CreateProjectService project(String project) {
        return put("project", project);
    }
    public CreateProjectService visibility(String visibility) {
        return put("visibility", visibility);
    }
}
