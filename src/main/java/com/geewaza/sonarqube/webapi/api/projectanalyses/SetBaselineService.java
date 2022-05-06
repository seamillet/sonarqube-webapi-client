package com.geewaza.sonarqube.webapi.api.projectanalyses;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Set an analysis as the baseline of the New Code Period on a project or a long-lived branch.
 * This manually set baseline overrides the `sonar.leak.period` setting.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class SetBaselineService extends AbstractService<SetBaselineService, Boolean> {
    public SetBaselineService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"analysis", "project"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_analyses/set_baseline");
        return true;
    }

    public SetBaselineService analysis(String analysis) {
        return put("analysis", analysis);
    }
    public SetBaselineService branch(String branch) {
        return put("branch", branch);
    }
    public SetBaselineService project(String project) {
        return put("project", project);
    }

}
