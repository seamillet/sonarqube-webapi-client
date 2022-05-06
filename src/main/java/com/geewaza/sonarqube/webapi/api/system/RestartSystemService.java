package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Restart server. Require 'Administer System' permission. Perform a full restart of the Web, Search and Compute Engine Servers processes.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class RestartSystemService extends AbstractService<RestartSystemService, Boolean> {
    public RestartSystemService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/system/restart");
        return true;
    }

}
