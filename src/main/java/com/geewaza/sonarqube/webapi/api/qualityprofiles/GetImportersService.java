package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.Exporters;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.Importers;

import java.io.IOException;

/**
 * Lists available profile export formats.
 * 
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetImportersService extends AbstractService<GetImportersService, Importers> {
    public GetImportersService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Importers doExecute() throws IOException {
        return doGet("api/qualityprofiles/importers", Importers.class);
    }
}
