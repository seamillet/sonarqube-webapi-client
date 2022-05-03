package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.webservice.WebserviceResponseExample;
import com.geewaza.sonarqube.webapi.model.webservice.Webservices;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 18:00
 **/
public interface WebservicesClient {

    /**
     * List web services
     *
     * @param includeInternals  Include web services that are implemented for internal use only. Their forward-compatibility is not assured
     * @return                  Webservices
     * @throws IOException      IOException
     */
    Webservices getWebserviceList(Boolean includeInternals) throws IOException;

    /**
     * Display web service response example
     *
     * @param action        Action of the web service
     * @param controller    Controller of the web service
     * @return              WebserviceResponseExample
     * @throws IOException  IOException
     */
    WebserviceResponseExample getWebserviceResponseExample(String action, String controller) throws IOException;

}
