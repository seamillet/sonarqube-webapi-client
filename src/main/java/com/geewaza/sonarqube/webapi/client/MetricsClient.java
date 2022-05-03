package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.measure.Metrics;
import com.geewaza.sonarqube.webapi.model.measure.Types;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:51
 **/
public interface MetricsClient {
    /**
     * Search for metrics
     *
     * @param p             1-based page number
     * @param ps            Page size. Must be greater than 0 and less or equal than 500
     * @return              Metrics
     * @throws IOException  IOException
     */
    Metrics searchMetrics(Integer p, Integer ps) throws IOException;

    /**
     * List all available metric types.
     *
     * @return              Types
     * @throws IOException  IOException
     */
    Types getTypes() throws IOException;
}
