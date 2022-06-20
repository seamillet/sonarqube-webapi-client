package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.issue.Issues;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-09 17:25
 **/
public class IssuesClientIT extends SonarIT {

    @Test
    public void searchIssuesService_test01() {
        String componentKey = "springboot-web-multi-module-demo01";
        Issues issues = client.getIssuesClient().searchIssues()
                .componentKeys(componentKey).types("CODE_SMELL")
                .additionalFields("_all")
                .facets("severities")
                .createdBefore(new Date())
                .ps(100)
                .execute();
        System.out.println(JSONObject.toJSONString(issues));
        Assert.assertNotNull(issues);
    }


}
