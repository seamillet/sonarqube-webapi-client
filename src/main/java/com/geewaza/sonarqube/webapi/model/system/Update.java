package com.geewaza.sonarqube.webapi.model.system;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class Update {
    private String status;
    private Require[] requires;
    private Release release;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Require[] getRequires() {
        return requires;
    }

    public void setRequires(Require[] requires) {
        this.requires = requires;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }
}
