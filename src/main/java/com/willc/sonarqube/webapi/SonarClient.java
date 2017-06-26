package com.willc.sonarqube.webapi;

import com.willc.sonarqube.webapi.client.*;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public interface SonarClient {
    BaseHttpClient getBaseSonarClient();

    CeClient getCeClient();

    ComponentClient getComponentClient();

    UserClient getUserClient();

    MeasureClient getMeasureClient();

    ProjectClient getProjectClient();

    SystemClient getSystemClient();
}
