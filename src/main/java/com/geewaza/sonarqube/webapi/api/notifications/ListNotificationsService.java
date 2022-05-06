package com.geewaza.sonarqube.webapi.api.notifications;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.notifications.Notifications;

import java.io.IOException;

/**
 * List notifications of the authenticated user.
 * Requires one of the following permissions:
 * Authentication if no login is provided
 * System administration if a login is provided
 *
 * @author : wangheng
 * @date : 2022-05-03 22:32
 **/
public class ListNotificationsService extends AbstractService<ListNotificationsService, Notifications> {
    public ListNotificationsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Notifications doExecute() throws IOException {
        return doGet("api/notifications/list", Notifications.class);
    }

    public ListNotificationsService login(String login) {
        return put("login", login);
    }
}
