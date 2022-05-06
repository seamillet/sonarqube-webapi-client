package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Changelogs;

import java.io.IOException;

/**
 * Display changelog of an issue.
 * Requires the 'Browse' permission on the project of the specified issue.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:53
 **/
public class GetChangelogService extends AbstractService<GetChangelogService, Changelogs> {
    public GetChangelogService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"issue"};
    }

    @Override
    protected Changelogs doExecute() throws IOException {
        return doGet("api/issues/changelog", Changelogs.class);
    }

    public GetChangelogService issue(String issue) {
        return put("issue", issue);
    }
}
