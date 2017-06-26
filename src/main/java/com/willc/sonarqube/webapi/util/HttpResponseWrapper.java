package com.willc.sonarqube.webapi.util;

import com.google.gson.Gson;
import com.willc.sonarqube.webapi.model.BaseModel;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class HttpResponseWrapper {
    public static final Gson GSON = new Gson();

    public static <T extends BaseModel> T wrap(String json, Class<T> cls) {
        return GSON.fromJson(json,cls);
    }
}
