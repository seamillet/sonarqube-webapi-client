package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Installs the latest version of a plugin specified by its key.
 * Plugin information is retrieved from Update Center.
 * Requires user to be authenticated with Administer System permissions
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class InstallPluginService extends AbstractService<InstallPluginService, Boolean> {
    public InstallPluginService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/plugins/install");
        return true;
    }

    public InstallPluginService key(String key) {
        return put("key", key);
    }
}
