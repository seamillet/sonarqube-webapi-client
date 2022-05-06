package com.geewaza.sonarqube.webapi.api.notifications;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Remove a notification for the authenticated user.
 * Requires one of the following permissions:
 * Authentication if no login is provided
 * System administration if a login is provided
 *
 * @author : wangheng
 * @date : 2022-05-03 22:32
 **/
public class RemoveNotificationsService extends AbstractService<RemoveNotificationsService, Boolean> {
    public RemoveNotificationsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"type"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/notifications/remove");
        return true;
    }
    public RemoveNotificationsService channel(String channel) {
        return put("channel", channel);
    }

    public RemoveNotificationsService login(String login) {
        return put("login", login);
    }

    public RemoveNotificationsService project(String project) {
        return put("project", project);
    }

    public RemoveNotificationsService type(String type) {
        return put("type", type);
    }
}
