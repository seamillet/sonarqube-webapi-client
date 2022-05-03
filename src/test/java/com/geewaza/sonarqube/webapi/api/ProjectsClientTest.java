package com.geewaza.sonarqube.webapi.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.client.impl.SonarClientImpl;
import com.geewaza.sonarqube.webapi.model.component.ProjectResponse;
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
 * @date : 2022-05-03 23:39
 **/
public class ProjectsClientTest {

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "geewaza";
    private static final String PASSWORD = "VaMD5AYR@_L2LB*";
    private static final String TOKEN = "ed97e566166633cf858e582042cf4a37d03195a5";


    @Test
    public void createProject_01() throws URISyntaxException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        ProjectResponse result = client.getProjectsClient().createProject().name("test05").project("test05").visibility("public").execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);

        Boolean result2 = client.getProjectsClient().bulkDeleteProject().projects("test05").execute();
        System.out.println(JSONObject.toJSONString(result2));
        Assert.assertTrue(result2);
    }

    @Test
    public void deleteProject_01() throws URISyntaxException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        Boolean result2 = client.getProjectsClient().deleteProject().project("test04").execute();
        System.out.println(JSONObject.toJSONString(result2));
        Assert.assertTrue(result2);
    }

}
