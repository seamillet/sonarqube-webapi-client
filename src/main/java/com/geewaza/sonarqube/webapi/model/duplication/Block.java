package com.geewaza.sonarqube.webapi.model.duplication;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:23
 **/
public class Block {

    private Integer from;
    private Integer size;
    private String _ref;

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String get_ref() {
        return _ref;
    }

    public void set_ref(String _ref) {
        this._ref = _ref;
    }
}
