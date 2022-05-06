package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Tags;

import java.io.IOException;

/**
 * List tags matching a given query
 *
 * @author : wangheng
 * @date : 2022-05-03 19:55
 **/
public class GetTagsService extends AbstractService<GetTagsService, Tags> {
    public GetTagsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Tags doExecute() throws IOException {
        return doGet("api/issues/tags", Tags.class);
    }

    public GetTagsService project(String project) {
        return put("project", project);
    }

    public GetTagsService ps(Integer ps) {
        return put("ps", ps);
    }

    public GetTagsService p(Integer p) {
        return put("p", p);
    }


}
