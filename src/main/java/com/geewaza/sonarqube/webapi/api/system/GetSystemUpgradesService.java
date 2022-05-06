package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Upgrades;

import java.io.IOException;

/**
 * Lists available upgrades for the SonarQube instance (if any) and for each one, lists incompatible plugins and plugins requiring upgrade.
 * Plugin information is retrieved from Update Center. Date and time at which Update Center was last refreshed is provided in the response.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetSystemUpgradesService extends AbstractService<GetSystemUpgradesService, Upgrades> {
    public GetSystemUpgradesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Upgrades doExecute() throws IOException {
        return doGet("api/system/upgrades", Upgrades.class);
    }
}
