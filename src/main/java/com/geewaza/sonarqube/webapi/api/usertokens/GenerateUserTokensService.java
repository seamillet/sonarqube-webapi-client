package com.geewaza.sonarqube.webapi.api.usertokens;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.usertokens.UserToken;

import java.io.IOException;

/**
 * Generate a user access token.
 * Please keep your tokens secret. They enable to authenticate and analyze projects.
 * It requires administration permissions to specify a 'login' and generate a token for another user. Otherwise, a token is generated for the current user.
 *
 * @author : wangheng
 * @date : 2022-05-05 09:09
 **/
public class GenerateUserTokensService extends AbstractService<GenerateUserTokensService, UserToken> {
    public GenerateUserTokensService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name"};
    }

    @Override
    protected UserToken doExecute() throws IOException {
        return doPost("api/user_tokens/generate", UserToken.class);
    }

    public GenerateUserTokensService login(String login) {
        return put("login", login);
    }

    public GenerateUserTokensService name(String name) {
        return put("name", name);
    }
}
