package com.willc.sonarqube.webapi.client.impl;

import com.willc.sonarqube.webapi.SonarClient;
import com.willc.sonarqube.webapi.client.*;

import java.net.URI;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class SonarClientImpl implements SonarClient{
    private final BaseHttpClient baseHttpClient;
    private final CeClient ceClient;
    private final ComponentClient componentClient;
    private final UserClient userClient;
    private final MeasureClient measureClient;
    private final ProjectClient projectClient;
    private final SystemClient systemClient;

    public SonarClientImpl(URI uri, String username, String passwordOrToken) {
        this.baseHttpClient = new BaseHttpClient(uri, username, passwordOrToken);

        this.ceClient = new CeClient(baseHttpClient);
        this.componentClient = new ComponentClient(baseHttpClient);
        this.userClient = new UserClient(baseHttpClient);
        this.measureClient = new MeasureClient(baseHttpClient);
        this.projectClient = new ProjectClient(baseHttpClient);
        this.systemClient = new SystemClient(baseHttpClient);
    }

    @Override
    public BaseHttpClient getBaseSonarClient() {
        return this.baseHttpClient;
    }

    @Override
    public CeClient getCeClient() {
        return this.ceClient;
    }

    @Override
    public ComponentClient getComponentClient() {
        return this.componentClient;
    }

    @Override
    public UserClient getUserClient() {
        return this.userClient;
    }

    @Override
    public MeasureClient getMeasureClient() {
        return this.measureClient;
    }

    @Override
    public ProjectClient getProjectClient() {
        return this.projectClient;
    }

    @Override
    public SystemClient getSystemClient() {
        return this.systemClient;
    }
}
