package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.AssociationStatusResponse;

import java.io.IOException;

/**
 * List projects with their association status regarding a quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetProjectQualityProfileService extends AbstractService<GetProjectQualityProfileService, AssociationStatusResponse> {
    public GetProjectQualityProfileService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected AssociationStatusResponse doExecute() throws IOException {
        return doGet("api/qualityprofiles/projects", AssociationStatusResponse.class);
    }
    public GetProjectQualityProfileService key(String key) {
        return put("key", key);
    }
    public GetProjectQualityProfileService p(Integer p) {
        return put("p", p);
    }
    public GetProjectQualityProfileService ps(Integer ps) {
        return put("ps", ps);
    }
    public GetProjectQualityProfileService q(String q) {
        return put("q", q);
    }
    public GetProjectQualityProfileService selected(String selected) {
        return put("selected", selected);
    }

}
