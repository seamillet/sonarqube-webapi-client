package com.geewaza.sonarqube.webapi.api.webhooks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Update a Webhook.
 * Requires 'Administer' permission on the specified project, or global 'Administer' permission.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:46
 **/
public class UpdateWebhookService extends AbstractService<UpdateWebhookService, Boolean> {
    public UpdateWebhookService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name", "url", "webhook"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/webhooks/update");
        return true;
    }

    public UpdateWebhookService name(String name) {
        return put("name", name);
    }
    public UpdateWebhookService secret(String secret) {
        return put("secret", secret);
    }
    public UpdateWebhookService url(String url) {
        return put("url", url);
    }
    public UpdateWebhookService webhook(String webhook) {
        return put("webhook", webhook);
    }
}
