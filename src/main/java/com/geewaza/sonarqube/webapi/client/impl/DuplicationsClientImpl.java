package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.DuplicationsClient;
import com.geewaza.sonarqube.webapi.model.duplication.Duplications;

import java.io.IOException;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:29
 **/
public class DuplicationsClientImpl extends AbstractSonarClient implements DuplicationsClient {
    public DuplicationsClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Get duplications. Require Browse permission on file's project
     *
     * @param key File key
     * @return Duplications
     * @throws IOException IOException
     */
    @Override
    public Duplications showDuplications(String key) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("key", key).build();
        return this.httpClient.get("api/duplications/show", params, Duplications.class);
    }
}
