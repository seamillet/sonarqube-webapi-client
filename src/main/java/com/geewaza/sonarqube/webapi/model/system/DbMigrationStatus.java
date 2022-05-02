package com.geewaza.sonarqube.webapi.model.system;

import java.util.Date;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class DbMigrationStatus {
    private String state;
    private String message;
    private Date startedAt;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }
}
