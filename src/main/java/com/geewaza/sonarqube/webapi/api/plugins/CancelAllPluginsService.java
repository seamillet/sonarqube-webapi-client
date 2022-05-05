package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Cancels any operation pending on any plugin (install, update or uninstall)
 * Requires user to be authenticated with Administer System permissions
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class CancelAllPluginsService extends AbstractService<CancelAllPluginsService, Boolean> {
    public CancelAllPluginsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/plugins/available");
        return true;
    }
}
