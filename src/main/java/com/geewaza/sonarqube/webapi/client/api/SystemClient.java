package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.system.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 10:39
 **/
public class SystemClient extends AbstractSonarClient {
    public SystemClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public ChangeLogLevelService changeLogLevel() {
        return new ChangeLogLevelService(this.httpClient);
    }
    public GetDbMigrationStatusService getDbMigrationStatus() {
        return new GetDbMigrationStatusService(this.httpClient);
    }
    public GetMigrateDbService getMigrateDb() {
        return new GetMigrateDbService(this.httpClient);
    }
    public GetSystemHealthService getSystemHealth() {
        return new GetSystemHealthService(this.httpClient);
    }
    public GetSystemLogsService getSystemLogs() {
        return new GetSystemLogsService(this.httpClient);
    }
    public GetSystemStatusService getSystemStatus() {
        return new GetSystemStatusService(this.httpClient);
    }
    public GetSystemUpgradesService getSystemUpgrades() {
        return new GetSystemUpgradesService(this.httpClient);
    }
    public RestartSystemService restartSystem() {
        return new RestartSystemService(this.httpClient);
    }
    public PingSystemService pingSystem() {
        return new PingSystemService(this.httpClient);
    }

}
