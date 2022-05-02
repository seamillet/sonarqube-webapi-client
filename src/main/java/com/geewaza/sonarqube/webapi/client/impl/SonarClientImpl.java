package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.SonarClient;
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
    private final ProjectClient projectClient;
    private final SystemClient systemClient;

    public SonarClientImpl(URI uri, String username, String passwordOrToken) {
        BaseHttpClient baseHttpClient = new BaseHttpClient(uri, username, passwordOrToken);

        this.ceClient = new CeClientImpl(baseHttpClient);
        this.componentClient = new ComponentClientImpl(baseHttpClient);
        this.userClient = new UserClientImpl(baseHttpClient);
        this.measureClient = new MeasureClientImpl(baseHttpClient);
        this.projectClient = new ProjectClientImpl(baseHttpClient);
        this.systemClient = new SystemClientImpl(baseHttpClient);
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
     * Get Project API Client
     *
     * @return ProjectClient
     */
    @Override
    public ProjectClient getProjectClient() {
        return this.projectClient;
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
}
