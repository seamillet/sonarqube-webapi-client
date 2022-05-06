package com.geewaza.sonarqube.webapi.api.projects;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Update a project or module key and all its sub-components keys.
 * Either 'from' or 'projectId' must be provided.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-03 23:24
 **/
public class UpdateProjectKeyService extends AbstractService<UpdateProjectKeyService, Boolean> {
    public UpdateProjectKeyService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"to"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/projects/update_key");
        return true;
    }
    public UpdateProjectKeyService from(String from) {
        return put("from", from);
    }
    public UpdateProjectKeyService to(String to) {
        return put("to", to);
    }
}
