package com.geewaza.sonarqube.webapi.api.projectbadges;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Generate badge for project's quality gate as an SVG.
 * Requires 'Browse' permission on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class GetQualityGateService extends AbstractService<GetQualityGateService, String> {
    public GetQualityGateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/project_badges/quality_gate");
    }

    public GetQualityGateService branch(String branch) {
        return put("branch", branch);
    }
    public GetQualityGateService project(String project) {
        return put("project", project);
    }

}
