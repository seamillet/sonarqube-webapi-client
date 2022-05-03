package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.language.Languages;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:47
 **/
public interface LanguagesClient {

    /**
     * List supported programming languages
     *
     * @param p             The size of the list to return, 0 for all languages
     * @param ps            A pattern to match language keys/names against
     * @return              Languages
     * @throws IOException  IOException
     */
    Languages getLanguageList(Integer p, Integer ps) throws IOException;
}
