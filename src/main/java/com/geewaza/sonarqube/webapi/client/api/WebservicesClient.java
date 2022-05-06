package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.webservices.GetResponseExampleService;
import com.geewaza.sonarqube.webapi.api.webservices.GetWebserviceListService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:22
 **/
public class WebservicesClient extends AbstractSonarClient {
    public WebservicesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public GetResponseExampleService getResponseExample() {
        return new GetResponseExampleService(this.httpClient);
    }
    public GetWebserviceListService getWebserviceList() {
        return new GetWebserviceListService(this.httpClient);
    }
}
