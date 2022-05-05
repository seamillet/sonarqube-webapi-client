package com.geewaza.sonarqube.webapi.api.projectbadges;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.AnalysisEvents;

import java.io.IOException;
import java.util.Date;

/**
 * Generate badge for project's measure as an SVG.
 * Requires 'Browse' permission on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class GetMeasureService extends AbstractService<GetMeasureService, String> {
    public GetMeasureService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"metric", "project"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/project_badges/measure");
    }

    public GetMeasureService branch(String branch) {
        return put("branch", branch);
    }
    public GetMeasureService metric(String metric) {
        return put("metric", metric);
    }
    public GetMeasureService project(String project) {
        return put("project", project);
    }

}
