package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Change severity.
 * Requires the following permissions:
 * 'Authentication'
 * 'Browse' rights on project of the specified issue
 * 'Administer Issues' rights on project of the specified issue
 *
 * @author : wangheng
 * @date : 2022-05-03 19:55
 **/
public class SetSeverityService extends AbstractService<SetSeverityService, Issue> {
    public SetSeverityService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"issue", "severity"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/set_severity", Issue.class);
    }

    public SetSeverityService issue(String issue) {
        return put("issue", issue);
    }

    public SetSeverityService severity(String severity) {
        return put("severity", severity);
    }
}
