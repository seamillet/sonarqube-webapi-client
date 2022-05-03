package com.geewaza.sonarqube.webapi.api.notifications;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Add a notification for the authenticated user.
 * Requires one of the following permissions:
 * Authentication if no login is provided. If a project is provided, requires the 'Browse' permission on the specified project.
 * System administration if a login is provided. If a project is provided, requires the 'Browse' permission on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:32
 **/
public class AddNotificationsService extends AbstractService<AddNotificationsService, String> {
    public AddNotificationsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"type"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doPost("api/notifications/add", String.class);
    }

    public AddNotificationsService issue(String channel) {
        return put("channel", channel);
    }

    public AddNotificationsService login(String login) {
        return put("login", login);
    }

    public AddNotificationsService project(String project) {
        return put("project", project);
    }

    public AddNotificationsService type(String type) {
        return put("type", type);
    }
}
