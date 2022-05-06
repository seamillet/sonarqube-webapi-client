package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.authentication.LoginAuthenticationService;
import com.geewaza.sonarqube.webapi.api.authentication.LogoutAuthenticationService;
import com.geewaza.sonarqube.webapi.api.authentication.ValidateAuthenticationService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:42
 **/
public class AuthenticationClient extends AbstractSonarClient {


    public AuthenticationClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Authenticate a user.
     *
     * @return
     */
    public LoginAuthenticationService loginAuthentication() {
        return new LoginAuthenticationService(this.httpClient);
    }

    /**
     * Logout a user.
     *
     * @return
     */
    public LogoutAuthenticationService logoutAuthentication() {
        return new LogoutAuthenticationService(this.httpClient);
    }

    /**
     * Check credentials.
     *
     * @return
     */
    public ValidateAuthenticationService validateAuthentication() {
        return new ValidateAuthenticationService(this.httpClient);
    }
}
