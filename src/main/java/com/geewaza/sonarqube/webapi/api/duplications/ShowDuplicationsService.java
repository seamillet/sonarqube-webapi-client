package com.geewaza.sonarqube.webapi.api.duplications;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.duplication.Duplications;

import java.io.IOException;

/**
 * Get duplications. Require Browse permission on file's project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:10
 **/
public class ShowDuplicationsService extends AbstractService<ShowDuplicationsService, Duplications> {
    public ShowDuplicationsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Duplications doExecute() throws IOException {
        return doGet("api/duplications/show", Duplications.class);
    }

    public ShowDuplicationsService key(String key) {
        return put("key", key);
    }
}
