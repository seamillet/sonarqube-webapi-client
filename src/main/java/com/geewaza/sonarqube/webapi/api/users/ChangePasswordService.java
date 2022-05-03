package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Update a user's password. Authenticated users can change their own password, provided that the account is not linked to an external authentication system. Administer System permission is required to change another user's password.
 *
 * @author : wangheng
 * @date : 2022-05-03 21:53
 **/
public class ChangePasswordService extends AbstractService<ChangePasswordService, String> {
    public ChangePasswordService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"login", "password"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doPost("api/users/change_password", String.class);
    }

    public ChangePasswordService login(String login) {
        return put("login", login);
    }
    public ChangePasswordService password(String password) {
        return put("password", password);
    }
    public ChangePasswordService previousPassword(String previousPassword) {
        return put("previousPassword", previousPassword);
    }
}
