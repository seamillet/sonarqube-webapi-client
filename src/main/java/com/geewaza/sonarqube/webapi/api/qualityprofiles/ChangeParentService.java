package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Change a quality profile's parent.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class ChangeParentService extends AbstractService<ChangeParentService, Boolean> {
    public ChangeParentService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/change_parent");
        return true;
    }
    public ChangeParentService language(String language) {
        return put("language", language);
    }
    public ChangeParentService parentQualityProfile(String parentQualityProfile) {
        return put("parentQualityProfile", parentQualityProfile);
    }
    public ChangeParentService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
