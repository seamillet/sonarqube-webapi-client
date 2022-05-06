package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.duplications.ShowDuplicationsService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

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
