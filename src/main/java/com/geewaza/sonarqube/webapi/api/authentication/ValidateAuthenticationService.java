package com.geewaza.sonarqube.webapi.api.authentication;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Check credentials.
 *
 * @author : wangheng
 * @date : 2022-05-05 09:43
 **/
public class ValidateAuthenticationService extends AbstractService<ValidateAuthenticationService, Boolean> {
    public ValidateAuthenticationService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        String response = doGet("api/authentication/validate");
        return JSONObject.parseObject(response).getBoolean("valid");
    }

}
