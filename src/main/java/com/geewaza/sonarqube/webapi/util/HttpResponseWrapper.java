package com.geewaza.sonarqube.webapi.util;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author chengkeqian
 * @date 2017/6/20
 */
public class HttpResponseWrapper {

    public static <T> T wrap(String json, Class<T> cls) {
        return JSONObject.parseObject(json,cls);
    }
}
