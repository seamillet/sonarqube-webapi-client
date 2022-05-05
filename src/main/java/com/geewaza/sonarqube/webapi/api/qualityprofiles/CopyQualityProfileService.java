package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.QualityProfile;

import java.io.IOException;

/**
 * Copy a quality profile.
 * Requires to be logged in and the 'Administer Quality Profiles' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class CopyQualityProfileService extends AbstractService<CopyQualityProfileService, QualityProfile> {
    public CopyQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"fromKey", "toName"};
    }

    @Override
    protected QualityProfile doExecute() throws IOException {
        return doPost("api/qualityprofiles/copy", QualityProfile.class);
    }
    public CopyQualityProfileService fromKey(String fromKey) {
        return put("fromKey", fromKey);
    }
    public CopyQualityProfileService toName(String toName) {
        return put("toName", toName);
    }

}
