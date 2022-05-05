package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.QualityProfileResponse;

import java.io.IOException;

/**
 * Rename a quality profile.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class RenameQualityProfileService extends AbstractService<RenameQualityProfileService, Boolean> {
    public RenameQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key", "name"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/rename");
        return true;
    }
    public RenameQualityProfileService key(String key) {
        return put("key", key);
    }
    public RenameQualityProfileService name(String name) {
        return put("name", name);
    }

}
