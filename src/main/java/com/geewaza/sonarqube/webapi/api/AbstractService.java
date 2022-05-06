package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.SonarQubeException;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 19:01
 **/
public abstract class AbstractService<T, S> {

    protected BaseHttpClient httpClient;

    protected Map<String, Object> params = Maps.newHashMap();

    public AbstractService(BaseHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public S execute() throws SonarQubeException {
        try {
            validate();
            return doExecute();
        } catch (Exception e) {
            throw new SonarQubeException(e);
        }
    }

    protected S doPost(String path, Class<S> clazz) throws IOException {
        return httpClient.post(path, params, null, clazz);
    }

    protected String doPost(String path) throws IOException {
        return httpClient.post(path, params, null);
    }

    protected S doGet(String path, Class<S> clazz) throws IOException {
        return httpClient.get(path, params, clazz);
    }

    protected String doGet(String path) throws IOException {
        return httpClient.get(path, params);
    }

    protected T putCsvParam(String key, String... value) {
        params.put(key, String.join(",", value));
        return (T) this;
    }

    protected T put(String key, Object value) {
        if (null != value) {
            if (value instanceof Date) {
                params.put(key, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format((Date) value));
            } else if (!(value instanceof String) || StringUtils.isNotBlank((String) value)) {
                params.put(key, value);
            }
        }
        return (T) this;
    }


    private void validate() throws NoSuchFieldException {
        String[] requiredParams = requiredParam();
        for (String key : requiredParams) {
            if (!params.containsKey(key)) {
                throw new NoSuchFieldException("Required field '" + key + "' not found!");
            }
        }
    }

    protected abstract String[] requiredParam();


    protected abstract S doExecute() throws IOException;


}
