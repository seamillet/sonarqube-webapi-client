package com.geewaza.sonarqube.webapi.model.user;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class Groups extends Paging {
    private Group[] groups;

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
