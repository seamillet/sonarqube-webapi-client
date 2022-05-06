package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Authors;

import java.io.IOException;

/**
 * Search SCM accounts which match a given query.
 * Requires authentication.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:52
 **/
public class GetAuthorsService extends AbstractService<GetAuthorsService, Authors> {
    public GetAuthorsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Authors doExecute() throws IOException {
        return doGet("api/issues/authors", Authors.class);
    }

    public GetAuthorsService project(String project) {
        return put("project", project);
    }

    public GetAuthorsService ps(Integer ps) {
        return put("ps", ps);
    }

    public GetAuthorsService p(Integer p) {
        return put("p", p);
    }

}
