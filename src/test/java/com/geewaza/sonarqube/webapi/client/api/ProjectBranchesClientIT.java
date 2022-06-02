package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.project.ProjectBranches;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-06-02 09:54
 **/
public class ProjectBranchesClientIT extends SonarIT {

    @Test
    public void listProjectBranches_01() {
        String project = "springboot-web-multi-module-demo01";
        ProjectBranches result = client.getProjectBranchesClient().listProjectBranches().project(project).execute();
        System.out.println(JSONObject.toJSONString(result));
        Assert.assertNotNull(result);
    }

}
