package com.geewaza.sonarqube.webapi.model.system;

import java.util.Date;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class Release {
    private String version;
    private Date status;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getStatus() {
        return status;
    }

    public void setStatus(Date status) {
        this.status = status;
    }
}
