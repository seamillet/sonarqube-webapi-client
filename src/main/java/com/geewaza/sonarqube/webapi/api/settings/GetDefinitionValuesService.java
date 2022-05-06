package com.geewaza.sonarqube.webapi.api.settings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Settings;

import java.io.IOException;

/**
 * List settings values.
 * If no value has been set for a setting, then the default value is returned.
 * The settings from conf/sonar.properties are excluded from results.
 * Requires 'Browse' or 'Execute Analysis' permission when a component is specified.
 * To access secured settings, one of the following permissions is required:
 * 'Execute Analysis'
 * 'Administer System'
 * 'Administer' rights on the specified component
 *
 * @author : wangheng
 * @date : 2022-05-05 11:48
 **/
public class GetDefinitionValuesService extends AbstractService<GetDefinitionValuesService, Settings> {
    public GetDefinitionValuesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Settings doExecute() throws IOException {
        return doGet("api/settings/values", Settings.class);
    }

    public GetDefinitionValuesService keys(String... keys) {
        return putCsvParam("keys", keys);
    }
    public GetDefinitionValuesService component(String component) {
        return put("component", component);
    }

}
