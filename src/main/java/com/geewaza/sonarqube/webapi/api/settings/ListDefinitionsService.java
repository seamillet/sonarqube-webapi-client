package com.geewaza.sonarqube.webapi.api.settings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Definitions;
import com.geewaza.sonarqube.webapi.model.system.Scm;

import java.io.IOException;

/**
 * List settings definitions.
 * Requires 'Browse' permission when a component is specified
 * To access licensed settings, authentication is required
 * To access secured settings, one of the following permissions is required:
 * 'Execute Analysis'
 * 'Administer System'
 * 'Administer' rights on the specified component
 *
 * @author : wangheng
 * @date : 2022-05-05 11:48
 **/
public class ListDefinitionsService extends AbstractService<ListDefinitionsService, Definitions> {
    public ListDefinitionsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected Definitions doExecute() throws IOException {
        return doGet("api/settings/list_definitions", Definitions.class);
    }

    public ListDefinitionsService component(String component) {
        return put("component", component);
    }
}
