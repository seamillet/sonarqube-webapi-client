package com.geewaza.sonarqube.webapi;

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
}
