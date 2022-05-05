package com.geewaza.sonarqube.webapi.api.projecttags;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Tags;
import com.geewaza.sonarqube.webapi.model.project.ProjectLinks;

import java.io.IOException;

/**
 * Search tags
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class SearchProjectTagsService extends AbstractService<SearchProjectTagsService, Tags> {
    public SearchProjectTagsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Tags doExecute() throws IOException {
        return doGet("api/project_tags/search", Tags.class);
    }

    public SearchProjectTagsService ps(Integer ps) {
        return put("ps", ps);
    }
    public SearchProjectTagsService q(String q) {
        return put("q", q);
    }


}
