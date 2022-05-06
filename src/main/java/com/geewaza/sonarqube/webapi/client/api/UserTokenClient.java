package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.usertokens.GenerateUserTokensService;
import com.geewaza.sonarqube.webapi.api.usertokens.RevokeUserTokensService;
import com.geewaza.sonarqube.webapi.api.usertokens.SearchUserTokensService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:20
 **/
public class UserTokenClient  extends AbstractSonarClient {
    public UserTokenClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Generate a user access token.
     * Please keep your tokens secret. They enable to authenticate and analyze projects.
     * It requires administration permissions to specify a 'login' and generate a token for another user. Otherwise, a token is generated for the current user.
     *
     * @return
     */
    public GenerateUserTokensService generateUserTokens() {
        return new GenerateUserTokensService(this.httpClient);
    }

    /**
     * Revoke a user access token.
     * It requires administration permissions to specify a 'login' and revoke a token for another user. Otherwise, the token for the current user is revoked.
     *
     * @return
     */
    public RevokeUserTokensService revokeUserTokens() {
        return new RevokeUserTokensService(this.httpClient);
    }

    /**
     * List the access tokens of a user.
     * The login must exist and active.
     * Field 'lastConnectionDate' is only updated every hour, so it may not be accurate, for instance when a user is using a token many times in less than one hour.
     *
     * @return
     */
    public SearchUserTokensService searchUserTokens() {
        return new SearchUserTokensService(this.httpClient);
    }
}
