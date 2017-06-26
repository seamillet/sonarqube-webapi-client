package com.willc.sonarqube.webapi.client;

import com.alibaba.fastjson.JSON;
import com.willc.sonarqube.webapi.model.ce.Task;
import com.willc.sonarqube.webapi.model.ce.Tasks;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class CeClient {
    private BaseHttpClient httpClient;

    public CeClient(BaseHttpClient baseHttpClient) {
        this.httpClient = baseHttpClient;
    }

    /**
     * Get Compute Engine tasks.
     * Requires the system administration permission,
     * or project administration permission if componentId is set.
     *
     * @return
     */
    public Tasks getCeTasks() throws IOException {
        String result = this.httpClient.get(String.format("api/ce/activity"));
        Tasks tasks = JSON.parseObject(result).getObject("tasks", Tasks.class);
        return tasks;
    }

    /**
     * Get Compute Engine task details info such as type, status, duration and associated component.
     * Requires 'Administer System' or 'Execute Analysis' permission.
     *
     * @param taskId
     * @return
     */
    public Task getCeTask(String taskId) throws IOException {
        String result = this.httpClient.get(String.format("api/ce/task?id=%s", taskId));
        Task task = JSON.parseObject(result).getObject("task", Task.class);
        return task;
    }

    /**
     * Get the pending tasks, in-progress tasks and the last executed task of a given component (usually a project).
     * Requires the administration permission on the component.
     *
     * @param componentId usually a project
     * @return
     */
    public String getComponentCeTask(String componentId) throws IOException {
        String result = this.httpClient.get(String.format("api/ce/component?componentId=%s", componentId));
        return result;
    }
}
