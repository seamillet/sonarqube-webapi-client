package com.geewaza.sonarqube.webapi.api.settings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Remove a setting value.
 * The settings defined in conf/sonar.properties are read-only and can't be changed.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified component
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class ResetDefinitionsService extends AbstractService<ResetDefinitionsService, Boolean> {
    public ResetDefinitionsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"keys"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/settings/reset");
        return true;
    }
    public ResetDefinitionsService keys(String... keys) {
        return putCsvParam("keys", keys);
    }
    public ResetDefinitionsService component(String component) {
        return put("component", component);
    }

}
