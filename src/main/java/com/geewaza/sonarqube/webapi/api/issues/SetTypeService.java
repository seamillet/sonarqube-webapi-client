package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Change type of issue, for instance from 'code smell' to 'bug'.
 * Requires the following permissions:
 * 'Authentication'
 * 'Browse' rights on project of the specified issue
 * 'Administer Issues' rights on project of the specified issue
 *
 * @author : wangheng
 * @date : 2022-05-03 19:55
 **/
public class SetTypeService extends AbstractService<SetTypeService, Issue> {
    public SetTypeService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"issue", "type"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/set_type", Issue.class);
    }

    public SetTypeService issue(String issue) {
        return put("issue", issue);
    }

    public SetTypeService type(String type) {
        return put("type", type);
    }
}
