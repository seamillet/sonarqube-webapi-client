package com.geewaza.sonarqube.webapi.api.settings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Settings;

import java.io.IOException;

/**
 * List settings values.
 * If no value has been set for a setting, then the default value is returned.
 * The settings from conf/sonar.properties are excluded from results.
 * Requires 'Browse' or 'Execute Analysis' permission when a component is specified.
 * Secured settings values are not returned by the endpoint.
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

    /**
     * List of setting keys
     *
     * @param keys Example value:sonar.test.inclusions,sonar.exclusions
     * @return GetDefinitionValuesService
     */
    public GetDefinitionValuesService keys(String... keys) {
        return putCsvParam("keys", keys);
    }

    /**
     * Component key
     *
     * @param component Example value: my_project
     * @return GetDefinitionValuesService
     */
    public GetDefinitionValuesService component(String component) {
        return put("component", component);
    }

}
