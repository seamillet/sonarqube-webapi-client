package com.geewaza.sonarqube.webapi.model.issue;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 20:28
 **/
public class Changelogs {

    private Changelog[] changelogs;

    public Changelog[] getChangelogs() {
        return changelogs;
    }

    public void setChangelogs(Changelog[] changelogs) {
        this.changelogs = changelogs;
    }
}
