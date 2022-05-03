package com.geewaza.sonarqube.webapi.api.webhooks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.webhooks.DeliveryResponse;

import java.io.IOException;

/**
 * Get the recent deliveries for a specified project or Compute Engine task.
 * Require 'Administer' permission on the related project.
 * Note that additional information are returned by api/webhooks/delivery.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetDeliveryService extends AbstractService<GetDeliveryService, DeliveryResponse> {
    public GetDeliveryService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"deliveryId"};
    }

    @Override
    protected DeliveryResponse doExecute() throws IOException {
        return doGet("api/webhooks/delivery", DeliveryResponse.class);
    }

    public GetDeliveryService deliveryId(String deliveryId) {
        return put("deliveryId", deliveryId);
    }
}
