package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.notifications.AddNotificationsService;
import com.geewaza.sonarqube.webapi.api.notifications.ListNotificationsService;
import com.geewaza.sonarqube.webapi.api.notifications.RemoveNotificationsService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:31
 **/
public class NotificationsClient  extends AbstractSonarClient {
    public NotificationsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public AddNotificationsService addNotifications() {
        return new AddNotificationsService(this.httpClient);
    }

    public ListNotificationsService listNotifications() {
        return new ListNotificationsService(this.httpClient);
    }

    public RemoveNotificationsService removeNotifications() {
        return new RemoveNotificationsService(this.httpClient);
    }
}

