package com.geewaza.sonarqube.webapi.api.server;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Version of SonarQube in plain text
 *
 * @author : wangheng
 * @date : 2022-05-05 11:48
 **/
public class GetServerVersionService extends AbstractService<GetServerVersionService, String> {
    public GetServerVersionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/server/version");
    }
}
