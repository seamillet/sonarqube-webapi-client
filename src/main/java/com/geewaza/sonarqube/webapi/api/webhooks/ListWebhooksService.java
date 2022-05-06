package com.geewaza.sonarqube.webapi.api.webhooks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.webhooks.Webhooks;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 23:02
 **/
public class ListWebhooksService extends AbstractService<ListWebhooksService, Webhooks> {
    public ListWebhooksService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Webhooks doExecute() throws IOException {
        return doGet("api/webhooks/list", Webhooks.class);
    }

    public ListWebhooksService project(String project) {
        return put("project", project);
    }

}
