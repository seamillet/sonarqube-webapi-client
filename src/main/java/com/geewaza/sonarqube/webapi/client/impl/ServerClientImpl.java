package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.ServerClient;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:20
 **/
public class ServerClientImpl extends AbstractSonarClient implements ServerClient {

    public ServerClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Version of SonarQube in plain text
     *
     * @return Version
     * @throws IOException IOException
     */
    @Override
    public String getServerVersion() throws IOException {
        return this.httpClient.get("api/server/version", null);
    }
}
