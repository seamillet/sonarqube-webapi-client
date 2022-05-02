package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.user.Groups;
import com.geewaza.sonarqube.webapi.model.user.UserResponse;
import com.geewaza.sonarqube.webapi.model.user.Users;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 23:52
 **/
public interface UserClient {

    /**
     * Update a user's password. Authenticated users can change their own password, provided that the account is not linked to an external authentication system. Administer System permission is required to change another user's password.
     *
     * @param login             User login
     * @param password          New password
     * @param previousPassword  Previous password. Required when changing one's own password.
     * @return                  success or not
     * @throws IOException      IOException
     */
    Boolean changeUserPassword(String login, String password, String previousPassword) throws IOException;

    /**
     * Create a user.
     * If a deactivated user account exists with the given login, it will be reactivated.
     * Requires Administer System permission
     *
     * @param login         User login
     * @param name          User name
     * @param email         User email
     * @param local         Specify if the user should be authenticated from SonarQube server or from an external authentication system. Password should not be set when local is set to false.
     * @param password      User password. Only mandatory when creating local user, otherwise it should not be set
     * @param scmAccount    List of SCM accounts. To set several values, the parameter must be called once for each value.
     * @return              UserResponse
     * @throws IOException  IOException
     */
    UserResponse createUser(String login, String name, String email, Boolean local, String password, String scmAccount) throws IOException;

    /**
     * Deactivate a user. Requires Administer System permission
     *
     * @param login         User login
     * @return              UserResponse
     * @throws IOException  IOException
     */
    UserResponse deactivateUser(String login) throws IOException;

    /**
     * Lists the groups a user belongs to.
     * Requires Administer System permission.
     *
     * @param login         A user login
     * @param p             1-based page number
     * @param ps            Page size. Must be greater than 0.
     * @param q             Limit search to group names that contain the supplied string.
     * @param selected      Depending on the value, show only selected items (selected=selected), deselected items (selected=deselected), or all items with their selection status (selected=all).
     * @return              Groups
     * @throws IOException  IOException
     */
    Groups getUserGroups(String login, Integer p, Integer ps, String q, String selected) throws IOException;

    /**
     * Get a list of active users.
     * The following fields are only returned when user has Administer System permission or for logged-in in user :
     *  - 'email'
     *  - 'externalIdentity'
     *  - 'externalProvider'
     *  - 'groups'
     *  - 'lastConnectionDate'
     *  - 'tokensCount'
     * Field 'lastConnectionDate' is only updated every hour, so it may not be accurate, for instance when a user authenticates many times in less than one hour.
     * @param p             1-based page number
     * @param ps            Page size. Must be greater than 0 and less or equal than 500
     * @param q             Filter on login, name and email
     * @return              Users
     * @throws IOException  IOException
     */
    Users searchUsers(Integer p, Integer ps, String q) throws IOException;

    /**
     * Update a user.
     * Requires Administer System permission
     *
     * @param login         User login
     * @param name          User name
     * @param email         User email
     * @param scmAccount    SCM accounts. To set several values, the parameter must be called once for each value.
     * @return              UserResponse
     * @throws IOException  IOException
     */
    UserResponse updateUser(String login, String name, String email, String scmAccount) throws IOException;

    /**
     * Update a user login. A login can be updated many times.
     * Requires Administer System permission
     *
     * @param login         The current login (case-sensitive)
     * @param newLogin      The new login. It must not already exist.
     * @return              success or not
     * @throws IOException  IOException
     */
    Boolean updateUserLogin(String login, String newLogin) throws IOException;
}
