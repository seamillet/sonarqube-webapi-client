package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.PluginInfo;

import java.io.IOException;

/**
 * Get the list of all the plugins installed on the SonarQube instance, sorted by plugin name.
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class GetPendingPluginsService extends AbstractService<GetPendingPluginsService, PluginInfo> {
    public GetPendingPluginsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected PluginInfo doExecute() throws IOException {
        return doGet("api/plugins/pending", PluginInfo.class);
    }

    /**
     * Comma-separated list of the additional fields to be returned in response. No additional field is returned by default. Possible values are:
     *  category - category as defined in the Update Center. A connection to the Update Center is needed
     *
     * @param f Possible values: category
     * @return
     */
    public GetPendingPluginsService f(String... f) {
        return putCsvParam("f", f);
    }
}
