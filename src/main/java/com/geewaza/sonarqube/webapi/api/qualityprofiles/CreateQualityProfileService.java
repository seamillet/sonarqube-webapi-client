package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.QualityProfileResponse;

import java.io.IOException;

/**
 * Create a quality profile.
 * Requires to be logged in and the 'Administer Quality Profiles' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class CreateQualityProfileService extends AbstractService<CreateQualityProfileService, QualityProfileResponse> {
    public CreateQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"language", "name"};
    }

    @Override
    protected QualityProfileResponse doExecute() throws IOException {
        return doPost("api/qualityprofiles/create", QualityProfileResponse.class);
    }
    public CreateQualityProfileService language(String language) {
        return put("language", language);
    }
    public CreateQualityProfileService name(String name) {
        return put("name", name);
    }

}
