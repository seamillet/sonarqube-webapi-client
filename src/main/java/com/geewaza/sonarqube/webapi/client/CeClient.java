package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.ce.CeComponent;
import com.geewaza.sonarqube.webapi.model.ce.TaskStatus;
import com.geewaza.sonarqube.webapi.model.ce.TaskResponse;
import com.geewaza.sonarqube.webapi.model.ce.Tasks;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 14:45
 **/
public interface CeClient {

    /**
     * Search for tasks.
     * Requires the system administration permission, or project administration permission if componentId is set.
     *
     * @param componentId       Id of the component (project) to filter on
     * @param maxExecutedAt     Maximum date of end of task processing (inclusive)
     * @param minSubmittedAt    Minimum date of task submission (inclusive)
     * @param onlyCurrents      Filter on the last tasks (only the most recent finished task by project)
     * @param ps                Page size. Must be greater than 0 and less or equal than 1000
     * @param q                 Limit search to:
     *                              - component names that contain the supplied string
     *                              - component keys that are exactly the same as the supplied string
     *                              - task ids that are exactly the same as the supplied string
     *                          Must not be set together with componentId
     * @param status            Comma separated list of task statuses
     * @param type              Task type
     * @return                  Tasks
     * @throws IOException      IOException
     */
    Tasks getActivityCe(String componentId, Date maxExecutedAt, Date minSubmittedAt, Boolean onlyCurrents, Integer ps, Integer q, List<String> status, String type) throws IOException;

    /**
     * Returns CE activity related metrics.
     * Requires 'Administer System' permission or 'Administer' rights on the specified project.
     *
     * @param componentId   Id of the component (project) to filter on
     * @return              Activity status
     * @throws IOException  IOException
     */
    TaskStatus getCeActivityStatus(String componentId) throws IOException;


    /**
     * Get the pending tasks, in-progress tasks and the last executed task of a given component (usually a project).
     * Requires the following permission: 'Browse' on the specified component.
     * Either 'componentId' or 'component' must be provided.
     *
     * @param component     Id of the component (project) to filter on
     * @return              CeComponent
     * @throws IOException  IOException
     */
    CeComponent getCeComponent(String component) throws IOException;


    /**
     * Give Compute Engine task details such as type, status, duration and associated component.
     * Requires 'Administer System' or 'Execute Analysis' permission.
     * Since 6.1, field "logs" is deprecated and its value is always false.
     *
     * @param id                Id of task
     * @param additionalFields  Comma-separated list of the optional fields to be returned in response.
     * @return                  Task of id
     * @throws IOException      IOException
     */
    TaskResponse getCeTask(String id, List<String> additionalFields) throws IOException;
}
