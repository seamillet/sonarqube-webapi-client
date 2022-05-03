package com.geewaza.sonarqube.webapi.api.projects;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;
import java.util.Date;

/**
 * Delete a project.
 * Requires 'Administer System' permission or 'Administer' permission on the project.
 *
 * @author : wangheng
 * @date : 2022-05-03 23:17
 **/
public class DeleteProjectService extends AbstractService<DeleteProjectService, Boolean> {
    public DeleteProjectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
         doPost("api/projects/delete");
         return true;
    }

    public DeleteProjectService project(String project) {
        return put("project", project);
    }

}
