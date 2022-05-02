package com.geewaza.sonarqube.webapi.client.impl;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.SystemClient;
import com.geewaza.sonarqube.webapi.model.system.DbMigrationStatus;
import com.geewaza.sonarqube.webapi.model.system.NodeHealth;
import com.geewaza.sonarqube.webapi.model.system.Status;
import com.geewaza.sonarqube.webapi.model.system.Upgrades;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class SystemClientImpl extends AbstractSonarClient implements SystemClient {

    public SystemClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }


    /**
     * Temporarily changes level of logs. New level is not persistent and is lost when restarting server. Requires system administration permission.
     *
     * @param level The new level. Be cautious: DEBUG, and even more TRACE, may have performance impacts.
     * @return success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean changeLogLevel(String level) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("level", level).build();
        this.httpClient.post("api/system/change_log_level", null, JSONObject.toJSONString(params));
        return true;
    }

    /**
     * Display the database migration status of SonarQube.
     * State values are:
     * - NO_MIGRATION: DB is up to date with current version of SonarQube.
     * - NOT_SUPPORTED: Migration is not supported on embedded databases.
     * - MIGRATION_RUNNING: DB migration is under go.
     * - MIGRATION_SUCCEEDED: DB migration has run and has been successful.
     * - MIGRATION_FAILED: DB migration has run and failed. SonarQube must be restarted in order to retry a DB migration (optionally after DB has been restored from backup).
     * - MIGRATION_REQUIRED: DB migration is required.
     *
     * @return DbMigrationStatus
     * @throws IOException IOException
     */
    @Override
    public DbMigrationStatus getDbMigrationStatus() throws IOException {
        return this.httpClient.get("api/system/db_migration_status", null, DbMigrationStatus.class);
    }

    /**
     * Provide health status of SonarQube.
     * Require 'Administer System' permission or authentication with passcode
     * <p>
     * - GREEN: SonarQube is fully operational
     * - YELLOW: SonarQube is usable, but it needs attention in order to be fully operational
     * - RED: SonarQube is not operational
     *
     * @return NodeHealth
     * @throws IOException IOException
     */
    @Override
    public NodeHealth getSystemHealth() throws IOException {
        return this.httpClient.get("api/system/health", null, NodeHealth.class);
    }

    /**
     * Get system logs in plain-text format. Requires system administration permission.
     *
     * @param process Process to get logs from
     * @return Log content
     * @throws IOException IOException
     */
    @Override
    public String getSystemLogs(String process) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("process", process).build();
        return this.httpClient.get("api/system/logs", params);
    }

    /**
     * Migrate the database to match the current version of SonarQube.
     * Sending a POST request to this URL starts the DB migration. It is strongly advised to make a database backup before invoking this WS.
     * State values are:
     * - NO_MIGRATION: DB is up to date with current version of SonarQube.
     * - NOT_SUPPORTED: Migration is not supported on embedded databases.
     * - MIGRATION_RUNNING: DB migration is under go.
     * - MIGRATION_SUCCEEDED: DB migration has run and has been successful.
     * - MIGRATION_FAILED: DB migration has run and failed. SonarQube must be restarted in order to retry a DB migration (optionally after DB has been restored from backup).
     * - MIGRATION_REQUIRED: DB migration is required.
     *
     * @return DbMigrationStatus
     * @throws IOException IOException
     */
    @Override
    public DbMigrationStatus migrateDb() throws IOException {
        return this.httpClient.post("api/projects/update_key", null, null, DbMigrationStatus.class);
    }

    /**
     * Answers "pong" as plain-text
     *
     * @return pong
     * @throws IOException IOException
     */
    @Override
    public String ping() throws IOException {
        return this.httpClient.get("api/system/ping", null);
    }

    /**
     * Restart server. Require 'Administer System' permission. Perform a full restart of the Web, Search and Compute Engine Servers processes.
     *
     * @return success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean restart() throws IOException {
        this.httpClient.post("api/system/restart", null, null);
        return true;
    }

    /**
     * Get state information about SonarQube.
     * status: the running status
     * <p>
     * - STARTING: SonarQube Web Server is up and serving some Web Services (eg. api/system/status) but initialization is still ongoing
     * - UP: SonarQube instance is up and running
     * - DOWN: SonarQube instance is up but not running because migration has failed (refer to WS /api/system/migrate_db for details) or some other reason (check logs).
     * - RESTARTING: SonarQube instance is still up but a restart has been requested (refer to WS /api/system/restart for details).
     * - DB_MIGRATION_NEEDED: database migration is required. DB migration can be started using WS /api/system/migrate_db.
     * - DB_MIGRATION_RUNNING: DB migration is running (refer to WS /api/system/migrate_db for details)
     *
     * @return
     * @throws IOException
     */
    @Override
    public Status getSystemStatus() throws IOException {
        return this.httpClient.get("api/system/status", null, Status.class);
    }

    /**
     * Lists available upgrades for the SonarQube instance (if any) and for each one, lists incompatible plugins and plugins requiring upgrade.
     * Plugin information is retrieved from Update Center. Date and time at which Update Center was last refreshed is provided in the response.
     *
     * @return Upgrades
     * @throws IOException IOException
     */
    @Override
    public Upgrades getUpgrades() throws IOException {
        return this.httpClient.get("api/system/upgrades", null, Upgrades.class);
    }
}
