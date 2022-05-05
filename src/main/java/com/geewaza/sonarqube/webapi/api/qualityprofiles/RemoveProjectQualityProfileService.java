package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.AssociationStatusResponse;

import java.io.IOException;

/**
 * Remove a project's association with a quality profile.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 * Administer right on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class RemoveProjectQualityProfileService extends AbstractService<RemoveProjectQualityProfileService, Boolean> {
    public RemoveProjectQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/remove_project");
        return true;
    }
    public RemoveProjectQualityProfileService language(String language) {
        return put("language", language);
    }
    public RemoveProjectQualityProfileService project(String project) {
        return put("project", project);
    }
    public RemoveProjectQualityProfileService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
