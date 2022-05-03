package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.duplication.Duplications;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:31
 **/
public interface DuplicationsClient {


    /**
     * Get duplications. Require Browse permission on file's project
     * @param key           File key
     * @return              Duplications
     * @throws IOException  IOException
     */
    Duplications showDuplications(String key) throws IOException;



}
