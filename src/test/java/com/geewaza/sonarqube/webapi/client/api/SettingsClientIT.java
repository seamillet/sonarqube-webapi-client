package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSON;
import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.system.Definitions;
import org.junit.Assert;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-06-02 10:08
 **/
public class SettingsClientIT extends SonarIT {

    @Test
    public void listDefinitions_01() {
        String projectKey = "springboot-web-multi-module-demo01";
        Definitions result = client.getSettingsClient().listDefinitions().component(projectKey).execute();
        System.out.println(JSON.toJSONString(result));
        Assert.assertNotNull(result);
    }

    @Test
    public void setDefinition_01() {
        String projectKey = "springboot-web-multi-module-demo01";
        String key = "sonar.coverage.jacoco.xmlReportPaths";
        String value = "target/site/jacoco-aggregate/jacoco.xml";
        Boolean result = client.getSettingsClient().setDefinition().component(projectKey).key(key).values(value).execute();
        System.out.println(JSON.toJSONString(result));
        Assert.assertNotNull(result);
        Definitions result2 = client.getSettingsClient().listDefinitions().component(projectKey).execute();
        System.out.println(JSON.toJSONString(result2));
    }
}
