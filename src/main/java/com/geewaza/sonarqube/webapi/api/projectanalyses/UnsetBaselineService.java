package com.geewaza.sonarqube.webapi.api.projectanalyses;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Unset any manually-set New Code Period baseline on a project or a long-lived branch.
 * Unsetting a manual baseline restores the use of the `sonar.leak.period` setting.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class UnsetBaselineService extends AbstractService<UnsetBaselineService, Boolean> {
    public UnsetBaselineService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_analyses/unset_baseline");
        return true;
    }

    public UnsetBaselineService branch(String branch) {
        return put("branch", branch);
    }
    public UnsetBaselineService project(String project) {
        return put("project", project);
    }

}
