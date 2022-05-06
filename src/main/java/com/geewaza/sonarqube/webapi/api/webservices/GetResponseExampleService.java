package com.geewaza.sonarqube.webapi.api.webservices;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.webservice.WebserviceResponseExample;

import java.io.IOException;

/**
 * Get information on the web api supported on this instance.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetResponseExampleService extends AbstractService<GetResponseExampleService, WebserviceResponseExample> {
    public GetResponseExampleService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"action", "controller"};
    }

    @Override
    protected WebserviceResponseExample doExecute() throws IOException {
        return doGet("api/webservices/response_example", WebserviceResponseExample.class);
    }

    public GetResponseExampleService action(Boolean action) {
        return put("action", action);
    }
    public GetResponseExampleService controller(Boolean controller) {
        return put("controller", controller);
    }
}
