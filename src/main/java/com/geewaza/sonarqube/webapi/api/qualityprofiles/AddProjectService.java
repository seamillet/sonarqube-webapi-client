package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Associate a project with a quality profile.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 * Administer right on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class AddProjectService extends AbstractService<AddProjectService, Boolean> {
    public AddProjectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/add_project");
        return true;
    }
    public AddProjectService language(String language) {
        return put("language", language);
    }
    public AddProjectService project(String project) {
        return put("project", project);
    }
    public AddProjectService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
