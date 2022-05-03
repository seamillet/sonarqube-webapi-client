package com.geewaza.sonarqube.webapi.api.webhooks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.webhooks.Deliveries;

import java.io.IOException;

/**
 * Get the recent deliveries for a specified project or Compute Engine task.
 * Require 'Administer' permission on the related project.
 * Note that additional information are returned by api/webhooks/delivery.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetDeliveriesService extends AbstractService<GetDeliveriesService, Deliveries> {
    public GetDeliveriesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Deliveries doExecute() throws IOException {
        return doGet("api/webhooks/deliveries", Deliveries.class);
    }

    public GetDeliveriesService ceTaskId(String ceTaskId) {
        return put("ceTaskId", ceTaskId);
    }
    public GetDeliveriesService componentKey(String componentKey) {
        return put("componentKey", componentKey);
    }
    public GetDeliveriesService p(Integer p) {
        return put("p", p);
    }
    public GetDeliveriesService ps(Integer ps) {
        return put("ps", ps);
    }
    public GetDeliveriesService webhook(String webhook) {
        return put("webhook", webhook);
    }
}
