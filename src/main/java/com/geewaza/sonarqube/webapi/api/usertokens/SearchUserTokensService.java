package com.geewaza.sonarqube.webapi.api.usertokens;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.usertokens.UserTokens;

import java.io.IOException;

/**
 * List the access tokens of a user.
 * The login must exist and active.
 * Field 'lastConnectionDate' is only updated every hour, so it may not be accurate, for instance when a user is using a token many times in less than one hour.
 *
 * @author : wangheng
 * @date : 2022-05-05 09:16
 **/
public class SearchUserTokensService extends AbstractService<SearchUserTokensService, UserTokens> {
    public SearchUserTokensService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected UserTokens doExecute() throws IOException {
        return doGet("api/user_tokens/search", UserTokens.class);
    }

    public SearchUserTokensService login(String login) {
        return put("login", login);
    }
}
