package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGate;

import java.io.IOException;

/**
 * Create a Quality Gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class CreateQualityGatesService extends AbstractService<CreateQualityGatesService, QualityGate> {
    public CreateQualityGatesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"name"};
    }

    @Override
    protected QualityGate doExecute() throws IOException {
        return doPost("api/qualitygates/create", QualityGate.class);
    }

    public CreateQualityGatesService name(String name) {
        return put("name", name);
    }

    public CreateQualityGatesService organization(String organization) {
        return put("organization", organization);
    }

}
