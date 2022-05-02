package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.system.DbMigrationStatus;
import com.geewaza.sonarqube.webapi.model.system.NodeHealth;
import com.geewaza.sonarqube.webapi.model.system.Status;
import com.geewaza.sonarqube.webapi.model.system.Upgrades;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 00:33
 **/
public interface SystemClient {

    /**
     * Temporarily changes level of logs. New level is not persistent and is lost when restarting server. Requires system administration permission.
     *
     * @param level         The new level. Be cautious: DEBUG, and even more TRACE, may have performance impacts.
     * @return              success or not
     * @throws IOException  IOException
     */
    Boolean changeLogLevel(String level) throws IOException;

    /**
     * Display the database migration status of SonarQube.
     * State values are:
     *  - NO_MIGRATION: DB is up to date with current version of SonarQube.
     *  - NOT_SUPPORTED: Migration is not supported on embedded databases.
     *  - MIGRATION_RUNNING: DB migration is under go.
     *  - MIGRATION_SUCCEEDED: DB migration has run and has been successful.
     *  - MIGRATION_FAILED: DB migration has run and failed. SonarQube must be restarted in order to retry a DB migration (optionally after DB has been restored from backup).
     *  - MIGRATION_REQUIRED: DB migration is required.
     * @return              DbMigrationStatus
     * @throws IOException  IOException
     */
    DbMigrationStatus getDbMigrationStatus() throws IOException;

    /**
     * Provide health status of SonarQube.
     * Require 'Administer System' permission or authentication with passcode
     *
     *  - GREEN: SonarQube is fully operational
     *  - YELLOW: SonarQube is usable, but it needs attention in order to be fully operational
     *  - RED: SonarQube is not operational
     *
     * @return              NodeHealth
     * @throws IOException  IOException
     */
    NodeHealth getSystemHealth() throws IOException;

    /**
     * Get system logs in plain-text format. Requires system administration permission.
     *
     * @param process       Process to get logs from
     * @return              Log content
     * @throws IOException  IOException
     */
    String getSystemLogs(String process) throws IOException;

    /**
     * Migrate the database to match the current version of SonarQube.
     * Sending a POST request to this URL starts the DB migration. It is strongly advised to make a database backup before invoking this WS.
     * State values are:
     *  - NO_MIGRATION: DB is up to date with current version of SonarQube.
     *  - NOT_SUPPORTED: Migration is not supported on embedded databases.
     *  - MIGRATION_RUNNING: DB migration is under go.
     *  - MIGRATION_SUCCEEDED: DB migration has run and has been successful.
     *  - MIGRATION_FAILED: DB migration has run and failed. SonarQube must be restarted in order to retry a DB migration (optionally after DB has been restored from backup).
     *  - MIGRATION_REQUIRED: DB migration is required.
     *
     * @return              DbMigrationStatus
     * @throws IOException  IOException
     */
    DbMigrationStatus migrateDb() throws IOException;

    /**
     * Answers "pong" as plain-text
     *
     * @return              pong
     * @throws IOException  IOException
     */
    String ping() throws IOException;

    /**
     * Restart server. Require 'Administer System' permission. Perform a full restart of the Web, Search and Compute Engine Servers processes.
     *
     * @return              success or not
     * @throws IOException  IOException
     */
    Boolean restart() throws IOException;

    /**
     * Get state information about SonarQube.
     * status: the running status
     *
     *  - STARTING: SonarQube Web Server is up and serving some Web Services (eg. api/system/status) but initialization is still ongoing
     *  - UP: SonarQube instance is up and running
     *  - DOWN: SonarQube instance is up but not running because migration has failed (refer to WS /api/system/migrate_db for details) or some other reason (check logs).
     *  - RESTARTING: SonarQube instance is still up but a restart has been requested (refer to WS /api/system/restart for details).
     *  - DB_MIGRATION_NEEDED: database migration is required. DB migration can be started using WS /api/system/migrate_db.
     *  - DB_MIGRATION_RUNNING: DB migration is running (refer to WS /api/system/migrate_db for details)
     *
     * @return
     * @throws IOException
     */
    Status getSystemStatus() throws IOException;

    /**
     * Lists available upgrades for the SonarQube instance (if any) and for each one, lists incompatible plugins and plugins requiring upgrade.
     * Plugin information is retrieved from Update Center. Date and time at which Update Center was last refreshed is provided in the response.
     *
     * @return              Upgrades
     * @throws IOException  IOException
     */
    Upgrades getUpgrades() throws IOException;
}
