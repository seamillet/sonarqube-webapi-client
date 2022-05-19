package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.model.component.ComponentResponse;
import com.geewaza.sonarqube.webapi.model.component.ComponentTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-19 11:05
 **/
public class ComponentsClientIT {

    private static final String SERVER_URL = "http://10.18.104.127:9000/";
    private static final String USER = "welink";
    private static final String PASSWORD = "qwer1234";
    private static final String TOKEN = "629973df7b9089d7bbbb89f848f0317f5b9f3702";

    private SonarClient client;

    @Before
    public void init() throws URISyntaxException {
        client = new SonarClient(new URI(SERVER_URL), USER, PASSWORD);
    }

    @Test
    public void showComponents_01() {
        Object[] test = {"springboot-web-multi-module-demo01", "master"};
        ComponentResponse result = client.getComponentsClient().showComponents()
                .component((String) test[0])
                .branch((String) test[1])
                .execute();
        Assert.assertNotNull(result);
        System.out.println(JSONObject.toJSONString(result));
    }

    @Test
    public void getComponentTree_01() {
        Object[] test = {"springboot-web-multi-module-demo01", "master"};
        ComponentTree result = client.getComponentsClient().getComponentTree()
                .component((String) test[0])
                .branch((String) test[1])
                .execute();
        Assert.assertNotNull(result);
        System.out.println(JSONObject.toJSONString(result));
    }


    @Test
    public void getComponentTree_02() {
        Object[] test = {"springboot-web-multi-module-demo01", "master"};
        ComponentTree result = client.getComponentsClient().getComponentTree()
                .component((String) test[0])
//                .branch((String) test[1])
                .execute();
        Assert.assertNotNull(result);
        System.out.println(JSONObject.toJSONString(result));
    }

}
