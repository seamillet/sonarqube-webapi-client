package com.geewaza.sonarqube.webapi.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 *
 * @author chengkeqian
 * @date 2017/6/20
 */
public class HttpResponseValidator {

    public static void validateResponse(HttpResponse response) throws IOException {
        int status = response.getStatusLine().getStatusCode();
        if(status < HttpStatus.SC_OK || status >= HttpStatus.SC_BAD_REQUEST) {
            throw new HttpResponseException(status, response.getStatusLine().getStatusCode()
                    + ":" + EntityUtils.toString(response.getEntity()));
        }
    }
}
