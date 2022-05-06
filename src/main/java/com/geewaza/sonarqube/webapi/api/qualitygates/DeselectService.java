package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Remove the association of a project from a quality gate.
 * Requires one of the following permissions:
 * 'Administer Quality Gates'
 * 'Administer' rights on the project
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class DeselectService extends AbstractService<DeselectService, Boolean> {
    public DeselectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/deselect");
        return true;
    }

    public DeselectService organization(String organization) {
        return put("organization", organization);
    }

    public DeselectService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

}
