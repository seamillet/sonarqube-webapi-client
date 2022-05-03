package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.WebservicesClient;
import com.geewaza.sonarqube.webapi.model.webservice.WebserviceResponseExample;
import com.geewaza.sonarqube.webapi.model.webservice.Webservices;

import java.io.IOException;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 18:13
 **/
public class WebservicesClientImpl extends AbstractSonarClient implements WebservicesClient {
    public WebservicesClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * List web services
     *
     * @param includeInternals Include web services that are implemented for internal use only. Their forward-compatibility is not assured
     * @return Webservices
     * @throws IOException IOException
     */
    @Override
    public Webservices getWebserviceList(Boolean includeInternals) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("include_internals", includeInternals).build();
        return this.httpClient.get("api/webservices/list", params, Webservices.class);
    }

    /**
     * Display web service response example
     *
     * @param action     Action of the web service
     * @param controller Controller of the web service
     * @return WebserviceResponseExample
     * @throws IOException IOException
     */
    @Override
    public WebserviceResponseExample getWebserviceResponseExample(String action, String controller) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("action", action).put("controller", controller).build();
        return this.httpClient.get("api/webservices/response_example", params, WebserviceResponseExample.class);
    }
}
