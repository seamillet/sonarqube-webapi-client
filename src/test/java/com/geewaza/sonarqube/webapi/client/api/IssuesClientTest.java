package com.geewaza.sonarqube.webapi.client.api;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.SonarClient;
import com.geewaza.sonarqube.webapi.model.issue.Issues;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-09 17:25
 **/
public class IssuesClientTest {

//
    private static final String SERVER_URL = "http://172.16.21.91:9000/";
    private static final String USER = "welink";
    private static final String PASSWORD = "qwer@1234";
    private static final String TOKEN = "48bd96fe7192f44bbc200123c0f6db9bcfd20a3e";


//    private static final String SERVER_URL = "http://localhost:9000/";
//    private static final String USER = "geewaza";
//    private static final String PASSWORD = "VaMD5AYR@_L2LB*";
//    private static final String TOKEN = " ed97e566166633cf858e582042cf4a37d03195a5";

    private SonarClient client;

    @Before
    public void init() throws URISyntaxException {
        client = new SonarClient(new URI(SERVER_URL), USER, PASSWORD);
    }

    @Test
    public void searchIssuesService_test01() {
        String componentKey = "we-link";
        Issues issues = client.getIssuesClient().searchIssues()
                .componentKeys(componentKey).types("CODE_SMELL")
                .additionalFields("_all")
                .facets("severities")
                .ps(100)
                .execute();
        System.out.println(JSONObject.toJSONString(issues));
        Assert.assertNotNull(issues);
    }

}
