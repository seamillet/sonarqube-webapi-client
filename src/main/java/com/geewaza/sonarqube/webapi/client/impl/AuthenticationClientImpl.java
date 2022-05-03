package com.geewaza.sonarqube.webapi.client.impl;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.client.AuthenticationClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.auth.ValidateResult;

import java.io.IOException;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:24
 **/
public class AuthenticationClientImpl extends AbstractSonarClient implements AuthenticationClient {
    public AuthenticationClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Authenticate a user.
     *
     * @param login    Login of the user
     * @param password Password of the user
     * @return Login result
     * @throws IOException IOException
     */
    @Override
    public String login(String login, String password) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login).put("password", password).build();
        return this.httpClient.post("api/system/change_log_level", null, JSONObject.toJSONString(params));
    }

    /**
     * Logout a user.
     *
     * @return Success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean logout() throws IOException {
        this.httpClient.post("api/authentication/logout", null, null);
        return true;
    }

    /**
     * Check credentials.
     *
     * @return ValidateResult
     * @throws IOException * @throws IOException
     */
    @Override
    public ValidateResult validate() throws IOException {
        return this.httpClient.post("api/authentication/validate", null, null, ValidateResult.class);
    }
}
