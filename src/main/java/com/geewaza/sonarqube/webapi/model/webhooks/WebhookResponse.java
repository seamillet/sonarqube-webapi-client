package com.geewaza.sonarqube.webapi.model.webhooks;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:47
 **/
public class WebhookResponse {

    private Webhook webhook;

    public Webhook getWebhook() {
        return webhook;
    }

    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }
}
