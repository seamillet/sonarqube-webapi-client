package com.geewaza.sonarqube.webapi.api.ce;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.ce.Tasks;

import java.io.IOException;
import java.util.Date;

/**
 * Search for tasks.
 * Requires the system administration permission, or project administration permission if componentId is set.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:27
 **/
public class GetActivityCeService extends AbstractService<GetActivityCeService, Tasks> {
    public GetActivityCeService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Tasks doExecute() throws IOException {
        return doGet("api/ce/activity", Tasks.class);
    }

    /**
     * Id of the component (project) to filter on
     *
     * @param componentId   Example value: AU-TpxcA-iU5OvuD2FL0
     * @return  GetActivityCeService
     */
    public GetActivityCeService componentId(String componentId) {
        return put("componentId", componentId);
    }

    /**
     * Maximum date of end of task processing (inclusive)
     *
     * @param maxExecutedAt Example value 2017-10-19T13:00:00+0200
     * @return  GetActivityCeService
     */
    public GetActivityCeService maxExecutedAt(Date maxExecutedAt) {
        return put("maxExecutedAt", maxExecutedAt);
    }

    /**
     * Minimum date of task submission (inclusive)
     *
     * @param minSubmittedAt    Example value: 2017-10-19T13:00:00+0200
     * @return  GetActivityCeService
     */
    public GetActivityCeService minSubmittedAt(Date minSubmittedAt) {
        return put("minSubmittedAt", minSubmittedAt);
    }

    /**
     * Filter on the last tasks (only the most recent finished task by project)
     *
     * @param onlyCurrents  Default value: false
     * @return  GetActivityCeService
     */
    public GetActivityCeService onlyCurrents(Boolean onlyCurrents) {
        return put("onlyCurrents", onlyCurrents);
    }

    /**
     * Page size. Must be greater than 0 and less or equal than 1000
     *
     * @param ps    Default value 100
     * @return  GetActivityCeService
     */
    public GetActivityCeService ps(Integer ps) {
        return put("ps", ps);
    }

    /**
     * Limit search to:
     * component names that contain the supplied string
     * component keys that are exactly the same as the supplied string
     * task ids that are exactly the same as the supplied string
     * Must not be set together with componentId
     *
     * @param q Example value : Apache
     * @return GetActivityCeService
     */
    public GetActivityCeService q(String q) {
        return put("q", q);
    }

    /**
     * Comma separated list of task statuses
     *
     * @param status    Default value : SUCCESS,FAILED,CANCELED
     * @return GetActivityCeService
     */
    public GetActivityCeService status(String... status) {
        return putCsvParam("status", status);
    }

    /**
     * Task type
     *
     * @param type Example value REPORT
     * @return  GetActivityCeService
     */
    public GetActivityCeService type(String type) {
        return put("type", type);
    }
}

