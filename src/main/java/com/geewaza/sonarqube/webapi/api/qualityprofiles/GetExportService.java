package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Export a quality profile.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetExportService extends AbstractService<GetExportService, String> {
    public GetExportService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/qualityprofiles/export");
    }
    public GetExportService language(String language) {
        return put("language", language);
    }
    public GetExportService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
