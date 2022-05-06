package com.geewaza.sonarqube.webapi.api.webservices;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.webhooks.Deliveries;
import com.geewaza.sonarqube.webapi.model.webservice.Webservices;

import java.io.IOException;

/**
 * Get information on the web api supported on this instance.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetWebserviceListService extends AbstractService<GetWebserviceListService, Webservices> {
    public GetWebserviceListService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Webservices doExecute() throws IOException {
        return doGet("api/webservices/list", Webservices.class);
    }

    public GetWebserviceListService includeInternals(Boolean includeInternals) {
        return put("include_internals", includeInternals);
    }
}
