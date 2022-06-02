package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.component.Components;
import com.geewaza.sonarqube.webapi.model.component.ProjectResponse;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 23:39
 **/
public class ProjectsClientIT extends SonarIT {



    @Test
    public void createProject_01() {
//        String project = "test-" + ToolMethods.getRandomCode(4);
        String project = "springboot-web-multi-module-demo01";
        System.out.println("project=" + project);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void createProject_02() {
//        String project = "test-" + ToolMethods.getRandomCode(4);
        String project = "2022_05_31_demo";
        System.out.println("project=" + project);
        ProjectResponse result = client.getProjectsClient().createProject().name(project).project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void deleteProject_01() {
        String project = "test-002";
        Boolean result2 = client.getProjectsClient().deleteProject().project(project).execute();
        System.out.println(JSONObject.toJSONString(result2));
        Assert.assertTrue(result2);
    }

    @Test
    public void searchProject_01() {
        Components result = client.getProjectsClient().searchProject().execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }


    @Test
    public void searchProject_02() {
        String project = "2022_05_31_demo";
        Components result = client.getProjectsClient().searchProject().projects(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }


    @Test
    public void updateProjectKey_01() {
        Boolean result = client.getProjectsClient().updateProjectKey().from("test04").to("test05").execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

}
