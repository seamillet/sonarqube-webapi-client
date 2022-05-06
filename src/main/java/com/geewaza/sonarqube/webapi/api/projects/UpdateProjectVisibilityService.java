package com.geewaza.sonarqube.webapi.api.projects;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Updates visibility of a project.
 * Requires 'Project administer' permission on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-03 23:24
 **/
public class UpdateProjectVisibilityService extends AbstractService<UpdateProjectVisibilityService, Boolean> {
    public UpdateProjectVisibilityService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project", "visibility"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/projects/update_visibility");
        return true;
    }
    public UpdateProjectVisibilityService project(String project) {
        return put("project", project);
    }
    public UpdateProjectVisibilityService visibility(String visibility) {
        return put("visibility", visibility);
    }
}
