package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.UserResponse;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 21:54
 **/
public class DeactivateUserService extends AbstractService<DeactivateUserService, UserResponse> {
    public DeactivateUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login"};
    }

    @Override
    protected UserResponse doExecute() throws IOException {
        return doPost("api/users/deactivate", UserResponse.class);
    }

    public DeactivateUserService login(String login) {
        return put("login", login);
    }
}
