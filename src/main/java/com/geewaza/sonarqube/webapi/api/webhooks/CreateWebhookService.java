package com.geewaza.sonarqube.webapi.api.webhooks;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.webhooks.WebhookResponse;

import java.io.IOException;

/**
 * Create a Webhook.
 * Requires 'Administer' permission on the specified project, or global 'Administer' permission.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:46
 **/
public class CreateWebhookService extends AbstractService<CreateWebhookService, WebhookResponse> {
    public CreateWebhookService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name", "url"};
    }

    @Override
    protected WebhookResponse doExecute() throws IOException {
        return doPost("api/webhooks/create", WebhookResponse.class);
    }

    public CreateWebhookService name(String name) {
        return put("name", name);
    }
    public CreateWebhookService project(String project) {
        return put("project", project);
    }
    public CreateWebhookService secret(String secret) {
        return put("secret", secret);
    }
    public CreateWebhookService url(String url) {
        return put("url", url);
    }
}
