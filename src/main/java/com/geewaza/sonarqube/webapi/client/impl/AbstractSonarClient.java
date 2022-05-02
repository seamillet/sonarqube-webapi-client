package com.geewaza.sonarqube.webapi.client.impl;

import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 21:16
 **/
public abstract class AbstractSonarClient {

    BaseHttpClient httpClient;

    public AbstractSonarClient(BaseHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    String buildCommaArray(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }


    static class ParamMapBuilder {

        SimpleDateFormat simpleDateFormat;

        public ParamMapBuilder() {
            this(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        }

        public ParamMapBuilder(SimpleDateFormat simpleDateFormat) {
            this.simpleDateFormat = simpleDateFormat;
        }

        private Map<String, Object> param = Maps.newHashMap();

        ParamMapBuilder put(String key, Object value) {
            if (null != value) {
                if (value instanceof Date) {
                    param.put(key, simpleDateFormat.format((Date) value));
                } else if (!(value instanceof String) || StringUtils.isNotBlank((String) value)) {
                    param.put(key, value);
                }
            }
            return this;
        }

        Map<String, Object> build() {
            return this.param;
        }
    }
}
