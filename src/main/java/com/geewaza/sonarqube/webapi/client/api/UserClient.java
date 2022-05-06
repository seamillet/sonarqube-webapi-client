package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.users.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 23:52
 **/
public class UserClient extends AbstractSonarClient {

    public UserClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Update a user's password. Authenticated users can change their own password, provided that the account is not linked to an external authentication system. Administer System permission is required to change another user's password.
     *
     * @return  ChangePasswordService
     */
    public ChangePasswordService changeUserPassword() {
        return new ChangePasswordService(this.httpClient);
    }

    /**
     * Create a user.
     * If a deactivated user account exists with the given login, it will be reactivated.
     * Requires Administer System permission
     *
     * @return  UserResponse
     */
    public CreateUserService createUser() {
        return new CreateUserService(this.httpClient);
    }

    /**
     * Deactivate a user. Requires Administer System permission
     *
     * @return  DeactivateUserService
     */
    public DeactivateUserService deactivateUser() {
        return new DeactivateUserService(this.httpClient);
    }

    /**
     * Lists the groups a user belongs to.
     * Requires Administer System permission.
     *
     * @return  GetUserGroupsService
     */
    public GetUserGroupsService getUserGroups() {
        return new GetUserGroupsService(this.httpClient);
    }

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
     *
     * @return  SearchUsersService
     */
    public SearchUsersService searchUsers() {
        return new SearchUsersService(this.httpClient);
    }

    /**
     * Update a user.
     * Requires Administer System permission
     *
     * @return  UpdateUserService
     */
    public UpdateUserService updateUser() {
        return new UpdateUserService(this.httpClient);
    }

    /**
     * Update a user login. A login can be updated many times.
     * Requires Administer System permission
     *
     * @return              success or not
     */
    public UpdateLoginService updateUserLogin() {
        return new UpdateLoginService(this.httpClient);
    }
}
