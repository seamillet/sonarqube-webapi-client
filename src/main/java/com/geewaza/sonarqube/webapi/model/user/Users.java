package com.geewaza.sonarqube.webapi.model.user;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class Users extends Paging {
    private User[] users;

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
