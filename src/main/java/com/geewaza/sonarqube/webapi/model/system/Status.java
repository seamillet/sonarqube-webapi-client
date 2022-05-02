package com.geewaza.sonarqube.webapi.model.system;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class Status {
    private String id;
    private String version;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
