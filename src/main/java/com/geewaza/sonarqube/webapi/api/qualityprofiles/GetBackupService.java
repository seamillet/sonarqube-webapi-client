package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Backup a quality profile in XML form. The exported profile can be restored through api/qualityprofiles/restore.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetBackupService extends AbstractService<GetBackupService, String> {
    public GetBackupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/qualityprofiles/add_project");
    }
    public GetBackupService language(String language) {
        return put("language", language);
    }
    public GetBackupService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
