package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.SonarIT;
import com.geewaza.sonarqube.webapi.model.system.Scm;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-06-06 18:23
 **/
public class SourcesClientIT extends SonarIT {
    @Test
    public void showSourceService_01() {
//        String component = "springboot-web-multi-module-demo01:welink-demo-test/src/main/java/com/zdww/cdyfzx/techcenter/demo/integrationtest/service/bussiness/SayHelloServiceIT.java";
        String component = "springboot-web-multi-module-demo01:welink-demo-service/src/main/java/com/zdww/cdyfzx/techcenter/demo/service/util/ToolMethods.java";
        String branch = "develop";
        Scm scm = client.getSourcesClient().showSource().key(component).branch(branch).execute();
        System.out.println(scm);

    }

}
