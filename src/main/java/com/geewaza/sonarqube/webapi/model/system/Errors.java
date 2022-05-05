package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 17:58
 **/
public class Errors {
    private Message[] errors;

    public Message[] getErrors() {
        return errors;
    }

    public void setErrors(Message[] errors) {
        this.errors = errors;
    }
}
