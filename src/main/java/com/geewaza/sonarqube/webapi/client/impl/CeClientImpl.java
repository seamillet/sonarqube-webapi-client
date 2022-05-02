package com.geewaza.sonarqube.webapi.client.impl;


import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.CeClient;
import com.geewaza.sonarqube.webapi.model.ce.CeComponent;
import com.geewaza.sonarqube.webapi.model.ce.TaskResponse;
import com.geewaza.sonarqube.webapi.model.ce.TaskStatus;
import com.geewaza.sonarqube.webapi.model.ce.Tasks;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class CeClientImpl extends AbstractSonarClient implements CeClient  {

    public CeClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Search for tasks.
     * Requires the system administration permission, or project administration permission if componentId is set.
     *
     * @param componentId    Id of the component (project) to filter on
     * @param maxExecutedAt  Maximum date of end of task processing (inclusive)
     * @param minSubmittedAt Minimum date of task submission (inclusive)
     * @param onlyCurrents   Filter on the last tasks (only the most recent finished task by project)
     * @param ps             Page size. Must be greater than 0 and less or equal than 1000
     * @param q              Limit search to:
     *                       - component names that contain the supplied string
     *                       - component keys that are exactly the same as the supplied string
     *                       - task ids that are exactly the same as the supplied string
     *                       Must not be set together with componentId
     * @param status         Comma separated list of task statuses
     * @param type           Task type
     * @return Tasks
     */
    @Override
    public Tasks getActivityCe(String componentId, Date maxExecutedAt, Date minSubmittedAt, Boolean onlyCurrents, Integer ps, Integer q, List<String> status, String type) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("componentId", componentId)
                .put("maxExecutedAt", maxExecutedAt).put("minSubmittedAt", minSubmittedAt)
                .put("onlyCurrents", onlyCurrents).put("ps", ps).put("q", q).put("status", buildCommaArray(status))
                .put("type", type).build();
        return this.httpClient.get("api/ce/activity", params, Tasks.class);
    }

    /**
     * Returns CE activity related metrics.
     * Requires 'Administer System' permission or 'Administer' rights on the specified project.
     *
     * @param componentId   Id of the component (project) to filter on
     * @return              Activity status
     * @throws IOException  IOException
     */
    @Override
    public TaskStatus getCeActivityStatus(String componentId) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("componentId", componentId).build();
        return this.httpClient.get("api/ce/activity_status", params, TaskStatus.class);
    }

    /**
     * Get the pending tasks, in-progress tasks and the last executed task of a given component (usually a project).
     * Requires the following permission: 'Browse' on the specified component.
     * Either 'componentId' or 'component' must be provided.
     *
     * @param component     Id of the component (project) to filter on
     * @return              CeComponent
     * @throws IOException  IOException
     */
    @Override
    public CeComponent getCeComponent(String component) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("component", component).build();
        return this.httpClient.get("api/ce/component", params, CeComponent.class);
    }

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
    @Override
    public TaskResponse getCeTask(String id, List<String> additionalFields) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("id", id).put("additionalFields", buildCommaArray(additionalFields)).build();
        return this.httpClient.get("api/ce/task", params, TaskResponse.class);
    }
}
