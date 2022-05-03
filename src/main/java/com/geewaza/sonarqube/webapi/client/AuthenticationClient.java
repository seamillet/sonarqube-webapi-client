package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.auth.ValidateResult;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:22
 **/
public interface AuthenticationClient {

    /**
     * Authenticate a user.
     *
     * @param login         Login of the user
     * @param password      Password of the user
     * @return              Login result
     * @throws IOException  IOException
     */
    String login(String login, String password) throws IOException;

    /**
     * Logout a user.
     *
     * @return              Success or not
     * @throws IOException  IOException
     */
    Boolean logout() throws IOException;

    /**
     * Check credentials.
     *
     * @return              ValidateResult
     * @throws IOException       * @throws IOException
     */
    ValidateResult validate() throws IOException;

}
