package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.QualityProfiles;

import java.io.IOException;

/**
 * Search quality profiles
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class SearchQualityProfileService extends AbstractService<SearchQualityProfileService, QualityProfiles> {
    public SearchQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected QualityProfiles doExecute() throws IOException {
        return doGet("api/qualityprofiles/search", QualityProfiles.class);
    }
    public SearchQualityProfileService language(String language) {
        return put("language", language);
    }
    public SearchQualityProfileService defaults(Boolean defaults) {
        return put("defaults", defaults);
    }
    public SearchQualityProfileService project(String project) {
        return put("project", project);
    }
    public SearchQualityProfileService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
