package com.geewaza.sonarqube.webapi.api.projecttags;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Set tags on a project.
 * Requires the following permission: 'Administer' rights on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class SetProjectTagService extends AbstractService<SetProjectTagService, Boolean> {
    public SetProjectTagService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"tags", "project"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_tags/set");
        return true;
    }

    public SetProjectTagService tags(String... tags) {
        return putCsvParam("tags", tags);
    }
    public SetProjectTagService project(String project) {
        return put("project", project);
    }


}
