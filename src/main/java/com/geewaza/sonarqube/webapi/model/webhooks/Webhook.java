package com.geewaza.sonarqube.webapi.model.webhooks;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:47
 **/
public class Webhook {
    private String key;
    private String name;
    private String url;
    private String secret;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
