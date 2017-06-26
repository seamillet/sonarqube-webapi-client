package com.willc.sonarqube.webapi.client;

import com.alibaba.fastjson.JSON;
import com.willc.sonarqube.webapi.model.system.DbMigrationStatus;
import com.willc.sonarqube.webapi.model.system.Languages;
import com.willc.sonarqube.webapi.model.system.Status;

import java.io.IOException;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class SystemClient {
    private BaseHttpClient httpClient;

    public SystemClient(BaseHttpClient baseHttpClient) {
        this.httpClient = baseHttpClient;
    }

    /**
     * Restart server.
     *
     * @return
     * @throws IOException
     */
    public boolean restart() throws IOException {
        httpClient.post("api/system/restart", null);
        return true;
    }

    /**
     * Temporarily changes level of logs.
     * New level is not persistent and is lost when restarting server.
     * Requires system administration permission.
     *
     * @param level Possible values[TRACE,DEBUG,INFO]. Be cautious: DEBUG, and even more TRACE, may have performance impacts.
     * @return
     * @throws IOException
     */
    public boolean changeLogLevel(String level) throws IOException {
        httpClient.post("api/system/change_log_level", String.format("{\"level\":%s}", level));
        return false;
    }

    /**
     * Migrate the database to match the current version of SonarQube.
     * Call this function to start the DB migration. It is strongly advised to make a database backup before invoking this WS.
     *
     * @return
     * @throws IOException
     */
    public boolean migrateDB() throws IOException {
        httpClient.post("api/system/migrate_db", null);
        return true;
    }

    /**
     * Display the database migration status of SonarQube.
     *
     * @return
     * @throws IOException
     */
    public DbMigrationStatus dbMigrationStatus() throws IOException {
        DbMigrationStatus migrationStatus = JSON.parseObject(httpClient.post("api/system/db_migration_status", null), DbMigrationStatus.class);
        return migrationStatus;
    }

    /**
     * Get the server status:
     *
     * @return
     * @throws IOException
     */
    public Status status() throws IOException {
        Status status = JSON.parseObject(httpClient.get("api/system/status"), Status.class);
        return status;
    }

    /**
     * System logs in plain-text format.
     * Requires system administration permission
     *
     * @return
     * @throws IOException
     */
    public String logs() throws IOException {
        return httpClient.get("api/system/logs");
    }

    /**
     * Detailed information about system configuration.
     * Requires user to be authenticated with Administer System permissions.
     *
     * @return
     * @throws IOException
     */
    public String systemInfo() throws IOException {
        return httpClient.get("api/system/info");
    }

    /**
     * Lists available upgrades for the SonarQube instance.
     * Lists incompatible plugins and plugins requiring upgrade.
     *
     * @return
     * @throws IOException
     */
    public String upgradesInfo() throws IOException {
        return httpClient.get("api/system/upgrades");
    }

    /**
     * List supported programming languages
     *
     * @return
     */
    public Languages listLanguages() throws IOException {
        String result = this.httpClient.get("api/languages/list");
        return JSON.parseObject(result, Languages.class);
    }
}
