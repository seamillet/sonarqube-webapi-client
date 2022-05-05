package com.geewaza.sonarqube.webapi.api.authentication;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Authenticate a user.
 *
 * @author : wangheng
 * @date : 2022-05-05 09:43
 **/
public class LoginAuthenticationService extends AbstractService<LoginAuthenticationService, Boolean> {
    public LoginAuthenticationService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "password"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/authentication/login");
        return true;
    }

    public LoginAuthenticationService login(String login) {
        return put("login", login);
    }

    public LoginAuthenticationService password(String password) {
        return put("password", password);
    }

}