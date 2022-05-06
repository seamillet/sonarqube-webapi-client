package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Answers "pong" as plain-text
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class PingSystemService extends AbstractService<PingSystemService, String> {
    public PingSystemService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/system/ping", String.class);
    }

}
