package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Update a user.
 * Requires Administer System permission
 *
 * @author : wangheng
 * @date : 2022-05-03 21:55
 **/
public class UpdateLoginService extends AbstractService<UpdateLoginService, String> {
    public UpdateLoginService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "newLogin"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doPost("api/users/update_login", String.class);
    }

    public UpdateLoginService login(String login) {
        return put("login", login);
    }

    public UpdateLoginService newLogin(String newLogin) {
        return put("newLogin", newLogin);
    }
}
