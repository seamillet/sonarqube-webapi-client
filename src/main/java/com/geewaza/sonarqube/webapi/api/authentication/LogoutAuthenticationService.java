package com.geewaza.sonarqube.webapi.api.authentication;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Logout a user.
 *
 * @author : wangheng
 * @date : 2022-05-05 09:43
 **/
public class LogoutAuthenticationService extends AbstractService<LogoutAuthenticationService, Boolean> {
    public LogoutAuthenticationService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/authentication/logout");
        return true;
    }

}
