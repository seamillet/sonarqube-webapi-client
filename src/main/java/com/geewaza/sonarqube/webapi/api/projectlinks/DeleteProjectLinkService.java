package com.geewaza.sonarqube.webapi.api.projectlinks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete existing project link.
 * Requires 'Administer' permission on the specified project, or global 'Administer' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class DeleteProjectLinkService extends AbstractService<DeleteProjectLinkService, Boolean> {
    public DeleteProjectLinkService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"id"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_links/delete");
        return true;
    }

    public DeleteProjectLinkService id(String id) {
        return put("id", id);
    }


}
