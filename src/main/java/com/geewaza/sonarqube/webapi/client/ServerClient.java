package com.geewaza.sonarqube.webapi.client;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:18
 **/
public interface ServerClient {

    /**
     * Version of SonarQube in plain text
     *
     * @return              Version
     * @throws IOException  IOException
     */
    String getServerVersion() throws IOException;
}
