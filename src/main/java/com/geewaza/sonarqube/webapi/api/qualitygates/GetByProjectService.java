package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGateResponse;

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
public class GetByProjectService extends AbstractService<GetByProjectService, QualityGateResponse> {
    public GetByProjectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"project"};
    }

    @Override
    protected QualityGateResponse doExecute() throws IOException {
        return doGet("api/qualitygates/get_by_project", QualityGateResponse.class);
    }

    public GetByProjectService organization(String organization) {
        return put("organization", organization);
    }

    public GetByProjectService project(String project) {
        return put("project", project);
    }

}
