package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.languages.ListLanguagesService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 10:15
 **/
public class LanguagesClient extends AbstractSonarClient {
    public LanguagesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public ListLanguagesService listLanguages() {
        return new ListLanguagesService(this.httpClient);
    }
}
