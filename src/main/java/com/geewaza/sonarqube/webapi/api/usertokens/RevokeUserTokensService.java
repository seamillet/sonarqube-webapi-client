package com.geewaza.sonarqube.webapi.api.usertokens;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Revoke a user access token.
 * It requires administration permissions to specify a 'login' and revoke a token for another user. Otherwise, the token for the current user is revoked.
 *
 * @author : wangheng
 * @date : 2022-05-05 09:13
 **/
public class RevokeUserTokensService extends AbstractService<RevokeUserTokensService, Boolean> {
    public RevokeUserTokensService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/user_tokens/revoke");
        return true;
    }

    public RevokeUserTokensService login(String login) {
        return put("login", login);
    }

    public RevokeUserTokensService name(String name) {
        return put("name", name);
    }
}
