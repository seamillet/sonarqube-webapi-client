package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.plugins.Plugins;

import java.io.IOException;

/**
 * Get the list of all the plugins available for installation on the SonarQube instance, sorted by plugin name.
 * Plugin information is retrieved from Update Center. Date and time at which Update Center was last refreshed is provided in the response.
 * Update status values are:
 * COMPATIBLE: plugin is compatible with current SonarQube instance.
 * INCOMPATIBLE: plugin is not compatible with current SonarQube instance.
 * REQUIRES_SYSTEM_UPGRADE: plugin requires SonarQube to be upgraded before being installed.
 * DEPS_REQUIRE_SYSTEM_UPGRADE: at least one plugin on which the plugin is dependent requires SonarQube to be upgraded.
 * Require 'Administer System' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class GetAvailablePluginsService extends AbstractService<GetAvailablePluginsService, Plugins> {
    public GetAvailablePluginsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Plugins doExecute() throws IOException {
        return doGet("api/plugins/available", Plugins.class);
    }
}
