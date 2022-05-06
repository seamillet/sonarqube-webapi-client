package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Set tags on an issue.
 * Requires authentication and Browse permission on project
 *
 * @author : wangheng
 * @date : 2022-05-03 19:55
 **/
public class SetTagsService extends AbstractService<SetTagsService, Issue> {
    public SetTagsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"issue"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/set_tags", Issue.class);
    }

    public SetTagsService issue(String issue) {
        return put("issue", issue);
    }

    public SetTagsService tags(String... tags) {
        return putCsvParam("tags", tags);
    }
}
