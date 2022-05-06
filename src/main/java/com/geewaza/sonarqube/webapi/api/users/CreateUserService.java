package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.UserResponse;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 21:54
 **/
public class CreateUserService extends AbstractService<CreateUserService, UserResponse> {
    public CreateUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "name"};
    }

    @Override
    protected UserResponse doExecute() throws IOException {
        return doPost("api/users/create", UserResponse.class);
    }

    public CreateUserService email(String email) {
        return put("email", email);
    }

    public CreateUserService local(Boolean local) {
        return put("local", local);
    }

    public CreateUserService login(String login) {
        return put("login", login);
    }

    public CreateUserService name(String name) {
        return put("name", name);
    }

    public CreateUserService password(String password) {
        return put("password", password);
    }

    public CreateUserService scmAccount(String scmAccount) {
        return put("scmAccount", scmAccount);
    }
}
