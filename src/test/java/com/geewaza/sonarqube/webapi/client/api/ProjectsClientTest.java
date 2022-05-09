package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.model.component.Components;
import com.geewaza.sonarqube.webapi.model.component.ProjectResponse;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 23:39
 **/
public class ProjectsClientTest {

//    private static final String SERVER_URL = "http://172.16.21.91:9000/";
//    private static final String USER = "welink";
//    private static final String PASSWORD = "qwer@1234";
//    private static final String TOKEN = "48bd96fe7192f44bbc200123c0f6db9bcfd20a3e";

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "geewaza";
    private static final String PASSWORD = "VaMD5AYR@_L2LB*";
    private static final String TOKEN = " ed97e566166633cf858e582042cf4a37d03195a5";


    @Test
    public void createProject_01() throws URISyntaxException {
//        String project = "test-" + ToolMethods.getRandomCode(4);
        String project = "test-002";
        System.out.println("project=" + project);
        SonarClient client = new SonarClient(new URI(SERVER_URL), USER, PASSWORD);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void deleteProject_01() throws URISyntaxException {
        String project = "test-002";
        SonarClient client = new SonarClient(new URI(SERVER_URL), TOKEN);
        Boolean result2 = client.getProjectsClient().deleteProject().project(project).execute();
        System.out.println(JSONObject.toJSONString(result2));
        Assert.assertTrue(result2);
    }

    @Test
    public void searchProject_01() throws URISyntaxException {
        SonarClient client = new SonarClient(new URI(SERVER_URL), TOKEN);
        Components result = client.getProjectsClient().searchProject().execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void updateProjectKey_01() throws URISyntaxException {
        SonarClient client = new SonarClient(new URI(SERVER_URL), TOKEN);
        Boolean result = client.getProjectsClient().updateProjectKey().from("test04").to("test05").execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

}
