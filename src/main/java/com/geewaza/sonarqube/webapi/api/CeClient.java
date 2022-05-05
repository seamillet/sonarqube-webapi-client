package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.ce.GetActivityCeService;
import com.geewaza.sonarqube.webapi.api.ce.GetCeActivityStatusService;
import com.geewaza.sonarqube.webapi.api.ce.GetCeComponentService;
import com.geewaza.sonarqube.webapi.api.ce.GetCeTaskService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 11:36
 **/
public class CeClient extends AbstractSonarClient {
    public CeClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public GetActivityCeService getActivityCe() {
        return new GetActivityCeService(this.httpClient);
    }
    public GetCeActivityStatusService getCeActivityStatus() {
        return new GetCeActivityStatusService(this.httpClient);
    }
    public GetCeComponentService getCeComponent() {
        return new GetCeComponentService(this.httpClient);
    }
    public GetCeTaskService getCeTask() {
        return new GetCeTaskService(this.httpClient);
    }
}
