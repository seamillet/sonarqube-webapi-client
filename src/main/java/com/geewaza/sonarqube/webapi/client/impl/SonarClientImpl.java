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
    private final CeClient ceClient;
    private final ComponentClient componentClient;
    private final UserClient userClient;
    private final MeasureClient measureClient;
    private final ProjectsClient projectsClient;
    private final SystemClient systemClient;
    private final IssuesClient issuesClient;
    private final NotificationsClient notificationsClient;
    private final WebhooksClient webhooksClient;

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

        this.ceClient = new CeClientImpl(baseHttpClient);
        this.componentClient = new ComponentClientImpl(baseHttpClient);
        this.userClient = new UserClient(baseHttpClient);
        this.measureClient = new MeasureClientImpl(baseHttpClient);
        this.projectsClient = new ProjectsClient(baseHttpClient);
        this.systemClient = new SystemClientImpl(baseHttpClient);
        this.issuesClient = new IssuesClient(baseHttpClient);
        this.notificationsClient = new NotificationsClient(baseHttpClient);
        this.webhooksClient = new WebhooksClient(baseHttpClient);
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
    public ComponentClient getComponentClient() {
        return this.componentClient;
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
}
