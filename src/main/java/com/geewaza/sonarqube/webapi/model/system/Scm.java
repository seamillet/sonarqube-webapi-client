package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:08
 **/
public class Scm {
    /**
     * [0] Line number
     * [1] Author of the commit
     * [2] Datetime of the commit (before 5.2 it was only the Date)
     * [3] Revision of the commit (added in 5.2)
     */
    private Object[][] scm;

    public Object[][] getScm() {
        return scm;
    }

    public void setScm(Object[][] scm) {
        this.scm = scm;
    }
}
