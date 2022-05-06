package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.DbMigrationStatus;

import java.io.IOException;

/**
 * Display the database migration status of SonarQube.
 * State values are:
 * NO_MIGRATION: DB is up to date with current version of SonarQube.
 * NOT_SUPPORTED: Migration is not supported on embedded databases.
 * MIGRATION_RUNNING: DB migration is under go.
 * MIGRATION_SUCCEEDED: DB migration has run and has been successful.
 * MIGRATION_FAILED: DB migration has run and failed. SonarQube must be restarted in order to retry a DB migration (optionally after DB has been restored from backup).
 * MIGRATION_REQUIRED: DB migration is required.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetDbMigrationStatusService extends AbstractService<GetDbMigrationStatusService, DbMigrationStatus> {
    public GetDbMigrationStatusService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected DbMigrationStatus doExecute() throws IOException {
        return doGet("api/system/db_migration_status", DbMigrationStatus.class);
    }
}
