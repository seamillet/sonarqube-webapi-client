package com.geewaza.sonarqube.webapi.model.issue;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 20:28
 **/
public class Changelog {
    private String user;
    private String userName;
    private String avatar;
    private Date creationDate;
    private Diff[] diffs;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Diff[] getDiffs() {
        return diffs;
    }

    public void setDiffs(Diff[] diffs) {
        this.diffs = diffs;
    }
}
