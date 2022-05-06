package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.projectbadges.GetMeasureService;
import com.geewaza.sonarqube.webapi.api.projectbadges.GetQualityGateService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:41
 **/
public class ProjectBadgesClient extends AbstractSonarClient {
    public ProjectBadgesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public GetMeasureService getMeasure() {
        return new GetMeasureService(this.httpClient);
    }

    public GetQualityGateService getQualityGate() {
        return new GetQualityGateService(this.httpClient);
    }

}
