package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.updatecenter.UpdateService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:00
 **/
public class UpdateCenterClient extends AbstractSonarClient {
    public UpdateCenterClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public UpdateService update() {
        return new UpdateService(this.httpClient);
    }
}
