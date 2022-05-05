package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Select the default profile for a given language.
 * Requires to be logged in and the 'Administer Quality Profiles' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class SetDefaultProfileService extends AbstractService<SetDefaultProfileService, Boolean> {
    public SetDefaultProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/set_default");
        return true;
    }

    public SetDefaultProfileService language(String language) {
        return put("language", language);
    }
    public SetDefaultProfileService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
