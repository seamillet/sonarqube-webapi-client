package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a quality profile and all its descendants. The default quality profile cannot be deleted.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class DeleteQualityProfileService extends AbstractService<DeleteQualityProfileService, Boolean> {
    public DeleteQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/delete");
        return true;
    }
    public DeleteQualityProfileService language(String language) {
        return put("language", language);
    }
    public DeleteQualityProfileService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
