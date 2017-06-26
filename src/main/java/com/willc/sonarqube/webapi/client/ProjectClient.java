package com.willc.sonarqube.webapi.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.willc.sonarqube.webapi.model.project.ProjectInfo;
import com.willc.sonarqube.webapi.model.project.Projects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class ProjectClient {
    private BaseHttpClient httpClient;

    public ProjectClient(BaseHttpClient baseHttpClient) {
        this.httpClient = baseHttpClient;
    }

    /**
     * Delete one or several projects.
     * Requires 'Administer System' permission.
     *
     * @param ids List of project ids to delete
     * @return
     * @throws IOException
     */
    public boolean deleteProjectsByIds(List<String> ids) throws IOException {
        this.httpClient.post("api/projects/bulk_delete", new JSONObject().put("ids", ids).toString());
        return true;
    }

    /**
     * Delete one or several projects.
     * Requires 'Administer System' permission.
     *
     * @param keys List of project keys to delete
     * @return
     * @throws IOException
     */
    public boolean deleteProjectsByKeys(List<String> keys) throws IOException {
        this.httpClient.post("api/projects/bulk_delete", new JSONObject().put("keys", keys).toString());
        return true;
    }

    /**
     * Delete a project.
     *
     * @param id ProjectInfo id
     * @return
     * @throws IOException
     */
    public boolean deleteProjectById(String id) throws IOException {
        this.httpClient.post("api/projects/delete", new JSONObject().put("id", id).toString());
        return true;
    }

    /**
     * Delete a project.
     *
     * @param key ProjectInfo key
     * @return
     * @throws IOException
     */
    public boolean deleteProjectByKey(String key) throws IOException {
        this.httpClient.post("api/projects/delete", new JSONObject().put("key", key).toString());
        return true;
    }

    /**
     * Create a project. Requires Create Projects permission
     *
     * @param name   Name of the project
     * @param key    Key of the project
     * @param branch SCM Branch of the project. The key of the project will become key:branch, for instance 'SonarQube:branch-5.0'
     * @return The project created
     * @throws IOException
     */
    public ProjectInfo createProject(String name, String key, String branch) throws IOException {
        Map<String, String> params = Maps.newHashMap();
        params.put("name", name);
        params.put("key", key);
        params.put("branch", "master");
        String result = this.httpClient.post("api/projects/create", JSON.toJSONString(params));
        return JSON.parseObject(result, ProjectInfo.class);
    }

    /**
     * List ghost projects.
     * Requires 'Administer System' permission.
     *
     * @param p  1-based page number
     * @param ps Page size. Must be greater than 0 and less than 500
     * @return
     * @throws IOException
     */
    public Projects getGhostsProjects(String p, String ps) throws IOException {
        return this.httpClient.get(String.format("api/projects/ghosts?f=uuid,name,key,creationDate&p=%s&ps=%s", p, ps), Projects.class);
    }

    /**
     * Get project info
     *
     * @param id project id
     * @return
     * @throws IOException
     */
    public ProjectInfo getProjectById(String id) throws IOException {
        String projectsContext = this.httpClient.get(String.format("api/projects/index?format=json&key=%s", id));
        String projectContext = JSON.parseArray(projectsContext).getJSONObject(0).toJSONString();
        return JSON.parseObject(projectContext, ProjectInfo.class);
    }

    /**
     * Get project info
     *
     * @param key project key
     * @return
     * @throws IOException
     */
    public ProjectInfo getProjectByKey(String key) throws IOException {
        String projectsContext = this.httpClient.get(String.format("api/projects/index?format=json&key=%s", key));
        String projectContext = JSON.parseArray(projectsContext).getJSONObject(0).toJSONString();
        return JSON.parseObject(projectContext, ProjectInfo.class);
    }

    /**
     * List all projects
     *
     * @return
     * @throws IOException
     */
    public List<ProjectInfo> getProjects() throws IOException {
        String projectsContext = this.httpClient.get("api/projects/index?format=json");
        return JSON.parseObject(projectsContext, new ArrayList<ProjectInfo>().getClass());
    }

    /**
     * List ghost projects.
     * Requires 'Administer System' permission.
     *
     * @param p  1-based page number
     * @param ps Page size. Must be greater than 0 and less than 500
     * @return
     * @throws IOException
     */
    public Projects getProvisionedProjects(String p, String ps) throws IOException {
        return this.httpClient.get(String.format("api/projects/provisioned?f=uuid,name,key,creationDate&p=%s&ps=%s", p, ps), Projects.class);
    }
}
