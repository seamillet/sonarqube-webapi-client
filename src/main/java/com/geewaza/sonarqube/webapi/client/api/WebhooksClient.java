package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.webhooks.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:45
 **/
public class WebhooksClient extends AbstractSonarClient {
    public WebhooksClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public CreateWebhookService createWebhook() {
        return new CreateWebhookService(this.httpClient);
    }

    public DeleteWebhookService deleteWebhook() {
        return new DeleteWebhookService(this.httpClient);
    }

    public GetDeliveriesService getDeliveries() {
        return new GetDeliveriesService(this.httpClient);
    }

    public GetDeliveryService getDelivery() {
        return new GetDeliveryService(this.httpClient);
    }

    public ListWebhooksService listWebhooks() {
        return new ListWebhooksService(this.httpClient);
    }

    public UpdateWebhookService updateWebhook() {
        return new UpdateWebhookService(this.httpClient);
    }
}
