package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.settings.GetDefinitionValuesService;
import com.geewaza.sonarqube.webapi.api.settings.ListDefinitionsService;
import com.geewaza.sonarqube.webapi.api.settings.ResetDefinitionsService;
import com.geewaza.sonarqube.webapi.api.settings.SetDefinitionService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:22
 **/
public class SettingsClient extends AbstractSonarClient {
    public SettingsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * List settings values.
     * If no value has been set for a setting, then the default value is returned.
     * The settings from conf/sonar.properties are excluded from results.
     * Requires 'Browse' or 'Execute Analysis' permission when a component is specified.
     * Secured settings values are not returned by the endpoint.
     *
     * @return  GetDefinitionValuesService
     */
    public GetDefinitionValuesService getDefinitionValues() {
        return new GetDefinitionValuesService(this.httpClient);
    }

    /**
     * List settings definitions.
     * Requires 'Browse' permission when a component is specified
     * To access licensed settings, authentication is required
     * To access secured settings, one of the following permissions is required:
     * 'Execute Analysis'
     * 'Administer System'
     * 'Administer' rights on the specified component
     *
     * @return  ListDefinitionsService
     */
    public ListDefinitionsService listDefinitions() {
        return new ListDefinitionsService(this.httpClient);
    }

    /**
     * Remove a setting value.
     * The settings defined in conf/sonar.properties are read-only and can't be changed.
     * Requires one of the following permissions:
     * 'Administer System'
     * 'Administer' rights on the specified component
     *
     * @return ResetDefinitionsService
     */
    public ResetDefinitionsService resetDefinitions() {
        return new ResetDefinitionsService(this.httpClient);
    }

    /**
     * Update a setting value.
     * Either 'value' or 'values' must be provided.
     * The settings defined in conf/sonar.properties are read-only and can't be changed.
     * Requires one of the following permissions:
     * 'Administer System'
     * 'Administer' rights on the specified component
     *
     * @return SetDefinitionService
     */
    public SetDefinitionService setDefinition() {
        return new SetDefinitionService(this.httpClient);
    }

}
