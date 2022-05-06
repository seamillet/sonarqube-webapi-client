package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Status;

import java.io.IOException;

/**
 * Get state information about SonarQube.
 * status: the running status
 *
 * STARTING: SonarQube Web Server is up and serving some Web Services (eg. api/system/status) but initialization is still ongoing
 * UP: SonarQube instance is up and running
 * DOWN: SonarQube instance is up but not running because migration has failed (refer to WS /api/system/migrate_db for details) or some other reason (check logs).
 * RESTARTING: SonarQube instance is still up but a restart has been requested (refer to WS /api/system/restart for details).
 * DB_MIGRATION_NEEDED: database migration is required. DB migration can be started using WS /api/system/migrate_db.
 * DB_MIGRATION_RUNNING: DB migration is running (refer to WS /api/system/migrate_db for details)
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetSystemStatusService extends AbstractService<GetSystemStatusService, Status> {
    public GetSystemStatusService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Status doExecute() throws IOException {
        return doGet("api/system/status", Status.class);
    }
}
