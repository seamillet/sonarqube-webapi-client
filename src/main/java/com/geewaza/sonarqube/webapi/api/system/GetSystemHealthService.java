package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.NodeHealth;

import java.io.IOException;

/**
 * Provide health status of SonarQube.
 * Require 'Administer System' permission or authentication with passcode
 *
 * GREEN: SonarQube is fully operational
 * YELLOW: SonarQube is usable, but it needs attention in order to be fully operational
 * RED: SonarQube is not operational
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetSystemHealthService extends AbstractService<GetSystemHealthService, NodeHealth> {
    public GetSystemHealthService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected NodeHealth doExecute() throws IOException {
        return doGet("api/system/health", NodeHealth.class);
    }
}
