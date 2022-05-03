package com.geewaza.sonarqube.webapi.api.webhooks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a Webhook.
 * Requires 'Administer' permission on the specified project, or global 'Administer' permission.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:46
 **/
public class DeleteWebhookService extends AbstractService<DeleteWebhookService, String> {
    public DeleteWebhookService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"webhook"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doPost("api/webhooks/delete", String.class);
    }

    public DeleteWebhookService webhook(String webhook) {
        return put("webhook", webhook);
    }
}
