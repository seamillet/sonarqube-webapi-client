package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Associate a project to a quality gate.
 * The 'projectId' or 'projectKey' must be provided.
 * Project id as a numeric value is deprecated since 6.1. Please use the id similar to 'AU-TpxcA-iU5OvuD2FLz'.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class SelectService extends AbstractService<SelectService, Boolean> {
    public SelectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"gateId"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/select");
        return true;
    }

    public SelectService gateId(Long gateId) {
        return put("gateId", gateId);
    }

    public SelectService organization(String organization) {
        return put("organization", organization);
    }
    public SelectService projectId(String projectId) {
        return put("projectId", projectId);
    }

    public SelectService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

}
