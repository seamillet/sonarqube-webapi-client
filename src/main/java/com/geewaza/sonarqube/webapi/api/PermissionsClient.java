package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.permissions.*;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 10:36
 **/
public class PermissionsClient extends AbstractSonarClient {

    public PermissionsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Add permission to a group.
     * This service defaults to global permissions, but can be limited to project permissions by providing project id or project key.
     * The group name or group id must be provided.
     * Requires one of the following permissions:
     * 'Administer System'
     * 'Administer' rights on the specified project
     *
     * @return  AddGroupService
     */
    public AddGroupService addGroup() {
        return new AddGroupService(this.httpClient);
    }

    /**
     * Add a group to a permission template.
     * The group id or group name must be provided.
     * Requires the following permission: 'Administer System'.
     *
     * @return  AddGroupToTemplateService
     */
    public AddGroupToTemplateService addGroupToTemplate() {
        return new AddGroupToTemplateService(this.httpClient);
    }

    /**
     * Add a project creator to a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  AddProjectCreatorToTemplateService
     */
    public AddProjectCreatorToTemplateService addProjectCreatorToTemplate() {
        return new AddProjectCreatorToTemplateService(this.httpClient);
    }

    /**
     * Add permission to a user.
     * This service defaults to global permissions, but can be limited to project permissions by providing project id or project key.
     * Requires one of the following permissions:
     * 'Administer System'
     * 'Administer' rights on the specified project
     *
     * @return  AddUserService
     */
    public AddUserService addUser() {
        return new AddUserService(this.httpClient);
    }

    /**
     * Add a user to a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  AddUserToTemplateService
     */
    public AddUserToTemplateService addUserToTemplate() {
        return new AddUserToTemplateService(this.httpClient);
    }

    /**
     * Apply a permission template to one project.
     * The project id or project key must be provided.
     * The template id or name must be provided.
     * Requires the following permission: 'Administer System'.
     *
     * @return  ApplyTemplateService
     */
    public ApplyTemplateService applyTemplate() {
        return new ApplyTemplateService(this.httpClient);
    }

    /**
     * Apply a permission template to several projects.
     * The template id or name must be provided.
     * Requires the following permission: 'Administer System'.
     *
     * @return  BulkApplyTemplateService
     */
    public BulkApplyTemplateService bulkApplyTemplate() {
        return new BulkApplyTemplateService(this.httpClient);
    }

    /**
     * Create a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  CreateTemplateService
     */
    public CreateTemplateService createTemplate() {
        return new CreateTemplateService(this.httpClient);
    }

    /**
     * Delete a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  DeleteTemplateService
     */
    public DeleteTemplateService deleteTemplate() {
        return new DeleteTemplateService(this.httpClient);
    }

    /**
     * Remove a group from a permission template.
     * The group id or group name must be provided.
     * Requires the following permission: 'Administer System'.
     *
     * @return  RemoveGroupFromTemplateService
     */
    public RemoveGroupFromTemplateService removeGroupFromTemplate() {
        return new RemoveGroupFromTemplateService(this.httpClient);
    }

    /**
     * Remove a permission from a group.
     * This service defaults to global permissions, but can be limited to project permissions by providing project id or project key.
     * The group id or group name must be provided, not both.
     * Requires one of the following permissions:
     * 'Administer System'
     * 'Administer' rights on the specified project
     *
     * @return  RemoveGroupService
     */
    public RemoveGroupService removeGroup() {
        return new RemoveGroupService(this.httpClient);
    }

    /**
     * Remove a project creator from a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  RemoveProjectCreatorFromTemplateService
     */
    public RemoveProjectCreatorFromTemplateService removeProjectCreatorFromTemplate() {
        return new RemoveProjectCreatorFromTemplateService(this.httpClient);
    }

    /**
     * Remove a user from a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  RemoveUserFromTemplateService
     */
    public RemoveUserFromTemplateService removeUserFromTemplate() {
        return new RemoveUserFromTemplateService(this.httpClient);
    }

    /**
     * Remove permission from a user.
     * This service defaults to global permissions, but can be limited to project permissions by providing project id or project key.
     * Requires one of the following permissions:
     * 'Administer System'
     * 'Administer' rights on the specified project
     *
     * @return  RemoveUserService
     */
    public RemoveUserService removeUser() {
        return new RemoveUserService(this.httpClient);
    }

    /**
     * List permission templates.
     * Requires the following permission: 'Administer System'.
     *
     * @return  SearchTemplateService
     */
    public SearchTemplateService searchTemplate() {
        return new SearchTemplateService(this.httpClient);
    }

    /**
     * Set a permission template as default.
     * Requires the following permission: 'Administer System'.
     *
     * @return  SetDefaultTemplateService
     */
    public SetDefaultTemplateService setDefaultTemplate() {
        return new SetDefaultTemplateService(this.httpClient);
    }

    /**
     * Update a permission template.
     * Requires the following permission: 'Administer System'.
     *
     * @return  UpdateTemplateService
     */
    public UpdateTemplateService updateTemplate() {
        return new UpdateTemplateService(this.httpClient);
    }
}
