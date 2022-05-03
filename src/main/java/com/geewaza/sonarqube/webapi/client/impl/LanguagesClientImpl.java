package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.LanguagesClient;
import com.geewaza.sonarqube.webapi.model.language.Languages;

import java.io.IOException;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:50
 **/
public class LanguagesClientImpl extends AbstractSonarClient implements LanguagesClient {
    public LanguagesClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * List supported programming languages
     *
     * @param p  The size of the list to return, 0 for all languages
     * @param ps A pattern to match language keys/names against
     * @return Languages
     * @throws IOException IOException
     */
    @Override
    public Languages getLanguageList(Integer p, Integer ps) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("p", p).put("ps", ps).build();
        return this.httpClient.get("api/languages/list", params, Languages.class);
    }
}
