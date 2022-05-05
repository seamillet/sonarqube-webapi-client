package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.Exporters;

import java.io.IOException;

/**
 * Lists available profile export formats.
 * 
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetExportersService extends AbstractService<GetExportersService, Exporters> {
    public GetExportersService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Exporters doExecute() throws IOException {
        return doGet("api/qualityprofiles/exporters", Exporters.class);
    }
}
