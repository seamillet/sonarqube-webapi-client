package com.geewaza.sonarqube.webapi.api.plugins;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Updates a plugin specified by its key to the latest version compatible with the SonarQube instance.
 * Plugin information is retrieved from Update Center.
 * Requires user to be authenticated with Administer System permissions
 *
 * @author : wangheng
 * @date : 2022-05-05 10:55
 **/
public class UpdatePluginService extends AbstractService<UpdatePluginService, Boolean> {
    public UpdatePluginService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/plugins/update");
        return true;
    }
    public UpdatePluginService key(String key) {
        return put("key", key);
    }
}
