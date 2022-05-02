package com.geewaza.sonarqube.webapi.model.system;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 01:10
 **/
public class Upgrade {
    private String version;
    private String description;
    private Date releaseDate;
    private String changeLogUrl;
    private String downloadUrl;
    private Plugins plugins;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getChangeLogUrl() {
        return changeLogUrl;
    }

    public void setChangeLogUrl(String changeLogUrl) {
        this.changeLogUrl = changeLogUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Plugins getPlugins() {
        return plugins;
    }

    public void setPlugins(Plugins plugins) {
        this.plugins = plugins;
    }
}
