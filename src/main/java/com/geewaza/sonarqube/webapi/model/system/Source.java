package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:08
 **/
public class Source {
    /**
     * [0] Line number
     * [1] Content of the line
     */
    private Object[][] sources;

    public Object[][] getSources() {
        return sources;
    }

    public void setSources(Object[][] sources) {
        this.sources = sources;
    }
}
