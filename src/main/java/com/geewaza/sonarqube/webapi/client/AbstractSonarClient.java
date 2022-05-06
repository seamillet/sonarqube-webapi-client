package com.geewaza.sonarqube.webapi.client;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 21:16
 **/
public abstract class AbstractSonarClient {

    protected BaseHttpClient httpClient;

    public AbstractSonarClient(BaseHttpClient httpClient) {
        this.httpClient = httpClient;
    }

}
