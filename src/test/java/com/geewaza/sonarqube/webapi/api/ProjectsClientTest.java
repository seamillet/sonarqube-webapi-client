package com.geewaza.sonarqube.webapi.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.client.SonarClientImpl;
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

    private static final String SERVER_URL = "http://localhost:9000/";
    private static final String USER = "geewaza";
    private static final String PASSWORD = "VaMD5AYR@_L2LB*";
    private static final String TOKEN = "ed97e566166633cf858e582042cf4a37d03195a5";

    private static final String ADMIN_TOKEN = "7608aa9abc210c335d8feb4686d0d871346a149f";

    private static final String TEST_TOKEN = "6e8f3449269c12355cfb93928df8731758b565db";


    @Test
    public void createProject_01() throws URISyntaxException {
        String project = "test07";
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).visibility("public").execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void deleteProject_01() throws URISyntaxException {
        String project = "test05";
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), ADMIN_TOKEN);
        Boolean result2 = client.getProjectsClient().deleteProject().project(project).execute();
        System.out.println(JSONObject.toJSONString(result2));
        Assert.assertTrue(result2);
    }

    @Test
    public void searchProject_01() throws URISyntaxException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TOKEN);
        Components result = client.getProjectsClient().searchProject().execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void updateProjectKey_01() throws URISyntaxException {
        SonarClient client = new SonarClientImpl(new URI(SERVER_URL), TEST_TOKEN);
        Boolean result = client.getProjectsClient().updateProjectKey().from("test04").to("test05").execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

}
