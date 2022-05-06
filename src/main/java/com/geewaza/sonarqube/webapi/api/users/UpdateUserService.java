package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.UserResponse;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 21:55
 **/
public class UpdateUserService extends AbstractService<UpdateUserService, UserResponse> {
    public UpdateUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login"};
    }

    @Override
    protected UserResponse doExecute() throws IOException {
        return doPost("api/users/update", UserResponse.class);
    }


    public UpdateUserService email(String email) {
        return put("email", email);
    }

    public UpdateUserService login(String login) {
        return put("login", login);
    }

    public UpdateUserService name(String name) {
        return put("name", name);
    }

    public UpdateUserService scmAccount(String scmAccount) {
        return put("scmAccount", scmAccount);
    }
}
