package com.geewaza.sonarqube.webapi;

import com.geewaza.sonarqube.webapi.api.*;
import com.geewaza.sonarqube.webapi.client.MeasureClient;
import com.geewaza.sonarqube.webapi.client.SystemClient;

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
    ComponentsClient getComponentsClient();

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
     * Get Projects API Client
     *
     * @return ProjectClient
     */
    ProjectsClient getProjectsClient();

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

    /**
     * Get UserToken API Client
     *
     * @return UserTokenClient
     */
    UserTokenClient getUserTokenClient();

    /**
     * Get Authentication API Client
     *
     * @return AuthenticationClient
     */
    AuthenticationClient getAuthenticationClient();

    /**
     * Get Permissions API Client
     *
     * @return PermissionsClient
     */
    PermissionsClient getPermissionsClient();

    /**
     * Get Plugins API Client
     *
     * @return PluginsClient
     */
    PluginsClient getPluginsClient();
}
