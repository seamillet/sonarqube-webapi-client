package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.api.*;
import com.geewaza.sonarqube.webapi.client.*;

import java.net.URI;

/**
 * @author chengkeqian, wangheng
 * @date 2017/6/20
 */
public class SonarClientImpl implements SonarClient {
    private final AuthenticationClient authenticationClient;
    private final CeClient ceClient;
    private final ComponentsClient componentsClient;
    private final UserClient userClient;
    private final MeasureClient measureClient;
    private final ProjectsClient projectsClient;
    private final SystemClient systemClient;
    private final IssuesClient issuesClient;
    private final NotificationsClient notificationsClient;
    private final WebhooksClient webhooksClient;
    private final UserTokenClient userTokenClient;
    private final PermissionsClient permissionsClient;

    /**
     * SonarClientImpl constructor with token
     * @param uri   Sonarqube host url
     * @param token Access token
     */
    public SonarClientImpl(URI uri, String token) {
        this(uri, token, "");
    }

    /**
     * SonarClientImpl constructor with username and password
     * @param uri       Sonarqube host url
     * @param username  User login name
     * @param password  Password
     */
    public SonarClientImpl(URI uri, String username, String password) {
        BaseHttpClient baseHttpClient = new BaseHttpClient(uri, username, password);

        this.authenticationClient = new AuthenticationClient(baseHttpClient);
        this.ceClient = new CeClientImpl(baseHttpClient);
        this.componentsClient = new ComponentsClient(baseHttpClient);
        this.userClient = new UserClient(baseHttpClient);
        this.measureClient = new MeasureClientImpl(baseHttpClient);
        this.projectsClient = new ProjectsClient(baseHttpClient);
        this.systemClient = new SystemClientImpl(baseHttpClient);
        this.issuesClient = new IssuesClient(baseHttpClient);
        this.notificationsClient = new NotificationsClient(baseHttpClient);
        this.webhooksClient = new WebhooksClient(baseHttpClient);
        this.userTokenClient = new UserTokenClient(baseHttpClient);
        this.permissionsClient = new PermissionsClient(baseHttpClient);
    }


    /**
     * Get Ce API Client
     *
     * @return CeClient
     */
    @Override
    public CeClient getCeClient() {
        return this.ceClient;
    }

    /**
     * Get Component API Client
     *
     * @return ComponentClient
     */
    @Override
    public ComponentsClient getComponentsClient() {
        return this.componentsClient;
    }

    /**
     * Get User API Client
     *
     * @return UserClient
     */
    @Override
    public UserClient getUserClient() {
        return this.userClient;
    }

    /**
     * Get Measure API Client
     *
     * @return MeasureClient
     */
    @Override
    public MeasureClient getMeasureClient() {
        return this.measureClient;
    }

    /**
     * Get Projects API Client
     *
     * @return ProjectClient
     */
    @Override
    public ProjectsClient getProjectsClient() {
        return this.projectsClient;
    }

    /**
     * Get System API Client
     *
     * @return SystemClient
     */
    @Override
    public SystemClient getSystemClient() {
        return this.systemClient;
    }

    /**
     * Get Issues API Client
     *
     * @return IssuesClient
     */
    @Override
    public IssuesClient getIssuesClient() {
        return this.issuesClient;
    }

    /**
     * Get Notifications API Client
     *
     * @return NotificationsClient
     */
    @Override
    public NotificationsClient getNotificationsClient() {
        return this.notificationsClient;
    }

    /**
     * Get Webhooks API Client
     *
     * @return WebhooksClient
     */
    @Override
    public WebhooksClient getWebhooksClient() {
        return this.webhooksClient;
    }

    /**
     * Get UserToken API Client
     *
     * @return WebhooksClient
     */
    @Override
    public UserTokenClient getUserTokenClient() {
        return this.userTokenClient;
    }

    /**
     * Get Authentication API Client
     *
     * @return AuthenticationClient
     */
    @Override
    public AuthenticationClient getAuthenticationClient() {
        return this.authenticationClient;
    }

    /**
     * Get Permissions API Client
     *
     * @return PermissionsClient
     */
    @Override
    public PermissionsClient getPermissionsClient() {
        return this.permissionsClient;
    }
}
