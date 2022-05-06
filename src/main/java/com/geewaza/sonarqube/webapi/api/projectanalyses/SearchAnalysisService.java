package com.geewaza.sonarqube.webapi.api.projectanalyses;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.AnalysisEvents;

import java.io.IOException;
import java.util.Date;

/**
 * Search a project analyses and attached events.
 * Requires the following permission: 'Browse' on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class SearchAnalysisService extends AbstractService<SearchAnalysisService, AnalysisEvents> {
    public SearchAnalysisService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project"};
    }

    @Override
    protected AnalysisEvents doExecute() throws IOException {
        return doGet("api/project_analyses/search", AnalysisEvents.class);
    }

    public SearchAnalysisService category(String category) {
        return put("category", category);
    }
    public SearchAnalysisService from(Date from) {
        return put("from", from);
    }
    public SearchAnalysisService to(Date to) {
        return put("to", to);
    }
    public SearchAnalysisService p(Integer p) {
        return put("p", p);
    }
    public SearchAnalysisService ps(Integer ps) {
        return put("ps", ps);
    }
    public SearchAnalysisService project(String project) {
        return put("project", project);
    }

}
