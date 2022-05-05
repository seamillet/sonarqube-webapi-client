package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.plugins.PluginUpdates;
import com.geewaza.sonarqube.webapi.model.plugins.Plugins;

import java.io.IOException;

/**
 * Lists plugins installed on the SonarQube instance for which at least one newer version is available, sorted by plugin name.
 * Each newer version is listed, ordered from the oldest to the newest, with its own update/compatibility status.
 * Plugin information is retrieved from Update Center. Date and time at which Update Center was last refreshed is provided in the response.
 * Update status values are: [COMPATIBLE, INCOMPATIBLE, REQUIRES_UPGRADE, DEPS_REQUIRE_UPGRADE].
 * Require 'Administer System' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class GetUpdatesPluginsService extends AbstractService<GetUpdatesPluginsService, PluginUpdates> {
    public GetUpdatesPluginsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected PluginUpdates doExecute() throws IOException {
        return doGet("api/plugins/updates", PluginUpdates.class);
    }

}
