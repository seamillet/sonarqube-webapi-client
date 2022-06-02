package com.geewaza.sonarqube.webapi;

import org.junit.Before;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by chengkeqian on 2017/6/20.
 *
 * @author will cheng
 * @since 2017-06-10
 */
public class SonarIT {

    public static final String SERVER_URL = "http://10.18.104.127:9000/";
    public static final String USER = "welink";
    public static final String PASSWORD = "qwer1234";
    public static final String TOKEN = "629973df7b9089d7bbbb89f848f0317f5b9f3702";

    protected SonarClient client ;

    @Before
    public void init() throws URISyntaxException {
        client = new SonarClient(new URI(SERVER_URL), TOKEN);
    }

}
