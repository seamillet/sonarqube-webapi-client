package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.Users;

import java.io.IOException;

/**
 * Get a list of active users.
 * The following fields are only returned when user has Administer System permission or for logged-in in user :
 * 'email'
 * 'externalIdentity'
 * 'externalProvider'
 * 'groups'
 * 'lastConnectionDate'
 * 'tokensCount'
 * Field 'lastConnectionDate' is only updated every hour, so it may not be accurate, for instance when a user authenticates many times in less than one hour.
 *
 * @author : wangheng
 * @date : 2022-05-03 21:55
 **/
public class SearchUsersService extends AbstractService<SearchUsersService, Users> {
    public SearchUsersService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Users doExecute() throws IOException {
        return doGet("api/users/search", Users.class);
    }

    public SearchUsersService p(Integer p) {
        return put("p", p);
    }

    public SearchUsersService ps(Integer ps) {
        return put("ps", ps);
    }

    public SearchUsersService q(String q) {
        return put("q", q);
    }
}
