package com.geewaza.sonarqube.webapi;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.model.user.Groups;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-04-27 17:27
 **/
public class SonarClientIT extends SonarIT {

    @Test
    public void initSonarClientWithUserPassword() {
        Groups groups = client.getUserClient().getUserGroups().login(USER).execute();
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

    @Test
    public void initSonarClientWithToken() {
        Groups groups = client.getUserClient().getUserGroups().login(USER).execute();
        System.out.println(JSONObject.toJSONString(groups));
        Assert.assertNotNull(groups);
    }

}
