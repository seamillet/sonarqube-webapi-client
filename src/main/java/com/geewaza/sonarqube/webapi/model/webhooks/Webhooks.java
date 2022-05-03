package com.geewaza.sonarqube.webapi.model.webhooks;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:47
 **/
public class Webhooks {

    private Webhook[] webhooks;

    public Webhook[] getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(Webhook[] webhooks) {
        this.webhooks = webhooks;
    }
}
