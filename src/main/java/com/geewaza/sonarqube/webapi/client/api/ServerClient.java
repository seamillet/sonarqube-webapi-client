package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.server.GetServerVersionService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 11:49
 **/
public class ServerClient extends AbstractSonarClient {
    public ServerClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public GetServerVersionService getServerVersion() {
        return new GetServerVersionService(this.httpClient);
    }
}
