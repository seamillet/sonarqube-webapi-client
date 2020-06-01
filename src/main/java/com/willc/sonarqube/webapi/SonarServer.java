package com.willc.sonarqube.webapi;

import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.willc.sonarqube.webapi.client.impl.SonarClientImpl;
import com.willc.sonarqube.webapi.model.user.Groups;
import com.willc.sonarqube.webapi.model.user.User;
import com.willc.sonarqube.webapi.model.user.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;

/**
 * Created by chengkeqian on 2017/6/20.
 *
 * @author will cheng
 * @since 2017-06-10
 */
public class SonarServer {
    private final Logger logger;
    private final SonarClient client;

    public SonarServer(URI serverUri) {
    	this(serverUri, null, null);
    }

    public SonarServer(URI serverUri, String username, String passwordOrToken) {
        this.logger = LoggerFactory.getLogger(this.getClass());
        this.client = new SonarClientImpl(serverUri, username, passwordOrToken);
    }

    /**
     * Retrieve client API endpoint
     * 
     * @return A client to query Sonar server
     */
    public SonarClient getClient() {
    	return this.client;
    }

    /**
     * Get user by login name
     *
     * @param login
     * @return
     * @throws IOException
     */
    public User getUser(String login) throws IOException {
        return client.getUserClient().getUser(login);
    }

    /**
     * Get a list of active users
     *
     * @param p  1-based page number. The default value is 1.
     * @param ps Page size. Must be greater than 0 and less than 500. The default value is 50.
     * @return
     * @throws IOException
     */
    public Users getUsers(String p, String ps) throws IOException {
        return client.getUserClient().getUsers(p, ps);
    }

    /**
     * Create a user. If a deactivated user account exists with the given login, it will be reactivated.
     * Requires Administer System permission.
     *
     * @param email    Required
     * @param login    login name. Required
     * @param name     full name. Required
     * @param password Required
     * @return the user created.
     */
    public User createUser(String email, String login, String name, String password) throws IOException {
        return client.getUserClient().createUser(login, email, name, password);
    }

    /**
     * Update a user. If a deactivated user account exists with the given login, it will be reactivated.
     * Requires Administer System permission.
     * Since 5.2, a user's password can only be changed using the 'updateUserPassword' action.
     *
     * @param login login name. Required
     * @param email
     * @param name
     * @return the user created.
     */
    public User updateUser(String login, String email, String name) throws IOException {
        return client.getUserClient().updateUser(login, email, name);
    }

    /**
     * Update a user's password. Authenticated users can change their own password.
     * Administer System permission is required to change another user's password.
     *
     * @param login            login name which is required.
     * @param password         new password which is required.
     * @param previousPassword previous password which is required when changing one's own password.
     * @return
     */
    public boolean updateUserPassword(String login, String password, String previousPassword) throws IOException {
        return client.getUserClient().updateUserPassword(login, password, previousPassword);
    }

    /**
     * Deactivate a user. Requires Administer System permission
     *
     * @param login login name which is required.
     * @return
     */
    public boolean deactivateUser(String login) throws IOException {
        return client.getUserClient().deactiveUser(login);
    }

    /**
     * List the groups a user belongs to.
     *
     * @param login    login name which is required.
     * @param p        1-based page number. The default value is 1.
     * @param ps       Page size. Must be greater than 0 and less than 500. The default value is 50.
     * @param selected Depending on the value, show only selected items (selected=selected), deselected items (selected=deselected),
     *                 or all items with their selection status (selected=all).
     * @return
     */
    public Groups getGroupsOfUser(String login, String p, String ps, String selected) throws IOException {
        return client.getUserClient().getGroupsOfUser(login, p, ps, selected);
    }

}
