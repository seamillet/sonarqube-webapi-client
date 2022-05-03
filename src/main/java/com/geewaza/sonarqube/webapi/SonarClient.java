package com.geewaza.sonarqube.webapi;

import com.geewaza.sonarqube.webapi.api.IssuesClient;
import com.geewaza.sonarqube.webapi.api.NotificationsClient;
import com.geewaza.sonarqube.webapi.api.UserClient;
import com.geewaza.sonarqube.webapi.api.WebhooksClient;
import com.geewaza.sonarqube.webapi.client.*;

/**
 *
 * @author chengkeqian
 * @date 2017/6/20
 */
public interface SonarClient {
    /**
     * Get Ce API Client
     *
     * @return CeClient
     */
    CeClient getCeClient();

    /**
     * Get Component API Client
     *
     * @return ComponentClient
     */
    ComponentClient getComponentClient();

    /**
     * Get User API Client
     *
     * @return UserClient
     */
    UserClient getUserClient();

    /**
     * Get Measure API Client
     *
     * @return MeasureClient
     */
    MeasureClient getMeasureClient();

    /**
     * Get Project API Client
     *
     * @return ProjectClient
     */
    ProjectClient getProjectClient();

    /**
     * Get System API Client
     *
     * @return SystemClient
     */
    SystemClient getSystemClient();

    /**
     * Get Issues API Client
     *
     * @return IssuesClient
     */
    IssuesClient getIssuesClient();

    /**
     * Get Notifications API Client
     *
     * @return NotificationsClient
     */
    NotificationsClient getNotificationsClient();

    /**
     * Get Webhooks API Client
     *
     * @return WebhooksClient
     */
    WebhooksClient getWebhooksClient();
}
