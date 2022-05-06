package com.geewaza.sonarqube.webapi.api.languages;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.language.Languages;

import java.io.IOException;

/**
 * List supported programming languages
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class ListLanguagesService extends AbstractService<ListLanguagesService, Languages> {
    public ListLanguagesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Languages doExecute() throws IOException {
        return doGet("api/languages/list", Languages.class);
    }

    public ListLanguagesService ps(Integer ps) {
        return put("ps", ps);
    }
    public ListLanguagesService q(String q) {
        return put("q", q);
    }
}
