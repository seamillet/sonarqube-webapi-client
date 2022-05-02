package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.component.Component;
import com.geewaza.sonarqube.webapi.model.component.Components;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 22:32
 **/
public interface ProjectClient {


    /**
     * Delete one or several projects.
     * Requires 'Administer System' permission.
     * At least one parameter is required among analyzedBefore, projects, projectIds (deprecated since 6.4) and q
     *
     * @param projects          Comma-separated list of project keys
     * @param analyzedBefore    Filter the projects for which last analysis is older than the given date (exclusive).
     *                          Either a date (server timezone) or datetime can be provided.
     * @param onProvisionedOnly Filter the projects that are provisioned
     * @param q                 Limit to:
     *                          - component names that contain the supplied string
     *                          - component keys that contain the supplied string
     * @param qualifiers        Comma-separated list of component qualifiers. Filter the results with the specified qualifiers
     * @return                  success or not
     * @throws IOException      IOException
     */
    Boolean bulkDeleteProject(List<String> projects, Date analyzedBefore, Boolean onProvisionedOnly, String q, List<String> qualifiers) throws IOException;


    /**
     * Create a project.
     * Requires 'Create Projects' permission
     *
     * @param name          Name of the project. If name is longer than 500, it is abbreviated.
     * @param project       Key of the project
     * @param visibility    Whether the created project should be visible to everyone, or only specific user/groups.
     *                      If no visibility is specified, the default project visibility of the organization will be used.
     * @return              Component
     * @throws IOException  IOException
     */
    Component createProject(String name, String project, String visibility) throws IOException;

    /**
     * Delete a project.
     * Requires 'Administer System' permission or 'Administer' permission on the project.
     *
     * @param project       project
     * @return              success or not
     * @throws IOException  IOException
     */
    Boolean deleteProject(String project) throws IOException;

    /**
     * Search for projects or views to administrate them.
     * Requires 'System Administrator' permission
     *
     * @param analyzedBefore    Filter the projects for which last analysis is older than the given date (exclusive).
     *                          Either a date (server timezone) or datetime can be provided.
     * @param onProvisionedOnly Filter the projects that are provisioned
     * @param projects          Comma-separated list of project keys
     * @param p                 1-based page number
     * @param ps                Page size. Must be greater than 0 and less or equal than 500
     * @param q                 Limit search to:
     *                          - component names that contain the supplied string
     *                          - component keys that contain the supplied string
     * @param qualifiers        Comma-separated list of component qualifiers. Filter the results with the specified qualifiers
     * @return                  Components
     * @throws IOException      IOException
     */
    Components searchProjects(Date analyzedBefore, Boolean onProvisionedOnly, List<String> projects, Integer p, Integer ps, String q, List<String> qualifiers) throws IOException;


    /**
     * Update a project or module key and all its sub-components keys.
     * Either 'from' or 'projectId' must be provided.
     * Requires one of the following permissions:
     *  - 'Administer System'
     *  - 'Administer' rights on the specified project
     *
     * @param from          Project or module key
     * @param to            New component key
     * @return              success or not
     * @throws IOException  IOException
     */
    Boolean updateProjectKey(String from, String to) throws IOException;

    /**
     * Updates visibility of a project.
     * Requires 'Project administer' permission on the specified project
     *
     * @param project       Project key
     * @param visibility    New visibility
     * @return              success or not
     * @throws IOException  IOException
     */
    Boolean updateProjectVisibility(String project, String visibility) throws IOException;
}
