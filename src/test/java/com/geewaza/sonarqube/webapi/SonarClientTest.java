package com.geewaza.sonarqube.webapi;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.client.SonarClientImpl;
import com.geewaza.sonarqube.webapi.model.user.Groups;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-04-27 17:27
 **/
public class SonarClientTest {

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "geewaza";
    private static final String PASSWORD = "VaMD5AYR@_L2LB*";
    private static final String TOKEN = "ed97e566166633cf858e582042cf4a37d03195a5";

    @Test
    public void initSonarClientWithUserPassword() throws URISyntaxException, IOException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), USER, PASSWORD);
        Groups groups = client.getUserClient().getUserGroups().login(USER).execute();
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

    @Test
    public void initSonarClientWithToken() throws URISyntaxException, IOException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        Groups groups = client.getUserClient().getUserGroups().login(USER).execute();
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

}
