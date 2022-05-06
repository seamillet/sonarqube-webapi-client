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
    public GetDefinitionValuesService getDefinitionValues() {
        return new GetDefinitionValuesService(this.httpClient);
    }
    public ListDefinitionsService listDefinitions() {
        return new ListDefinitionsService(this.httpClient);
    }
    public ResetDefinitionsService resetDefinitions() {
        return new ResetDefinitionsService(this.httpClient);
    }
    public SetDefinitionService setDefinition() {
        return new SetDefinitionService(this.httpClient);
    }

}
