package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.duplications.ShowDuplicationsService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:12
 **/
public class DuplicationsClient extends AbstractSonarClient {
    public DuplicationsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public ShowDuplicationsService showDuplications() {
        return new ShowDuplicationsService(this.httpClient);
    }
}
