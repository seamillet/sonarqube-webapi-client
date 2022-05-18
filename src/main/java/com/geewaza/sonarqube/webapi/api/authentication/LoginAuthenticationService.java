package com.geewaza.sonarqube.webapi.api.authentication;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

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

    /**
     * Login of the user
     *
     * @param login Login of the user
     * @return  LoginAuthenticationService
     */
    public LoginAuthenticationService login(String login) {
        return put("login", login);
    }

    /**
     * Password of the user
     *
     * @param password  Password of the user
     * @return  LoginAuthenticationService
     */
    public LoginAuthenticationService password(String password) {
        return put("password", password);
    }

}
