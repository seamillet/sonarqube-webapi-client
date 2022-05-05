package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.Inheritance;

import java.io.IOException;

/**
 * Show a quality profile's ancestors and children.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetInheritanceService extends AbstractService<GetInheritanceService, Inheritance> {
    public GetInheritanceService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Inheritance doExecute() throws IOException {
        return doGet("api/qualityprofiles/inheritance", Inheritance.class);
    }
    public GetInheritanceService language(String language) {
        return put("language", language);
    }
    public GetInheritanceService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }

}
