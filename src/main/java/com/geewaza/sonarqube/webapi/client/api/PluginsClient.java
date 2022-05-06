package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.plugins.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 11:21
 **/
public class PluginsClient extends AbstractSonarClient {

    public PluginsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public CancelAllPluginsService cancelAllPlugins() {
        return new CancelAllPluginsService(this.httpClient);
    }

    public GetAvailablePluginsService getAvailablePlugins() {
        return new GetAvailablePluginsService(this.httpClient);
    }

    public GetInstalledPluginsService getInstalledPlugins() {
        return new GetInstalledPluginsService(this.httpClient);
    }

    public GetPendingPluginsService getPendingPlugins() {
        return new GetPendingPluginsService(this.httpClient);
    }

    public GetUpdatesPluginsService getUpdatesPlugins() {
        return new GetUpdatesPluginsService(this.httpClient);
    }
    public InstallPluginService installPlugin() {
        return new InstallPluginService(this.httpClient);
    }
    public UninstallPluginService uninstallPlugin() {
        return new UninstallPluginService(this.httpClient);
    }
    public UpdatePluginService updatePlugin() {
        return new UpdatePluginService(this.httpClient);
    }
}
