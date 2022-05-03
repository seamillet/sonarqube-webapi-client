package com.geewaza.sonarqube.webapi.model;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:54
 **/
public class PageModel {

    private int p;
    private int ps;
    private int total;

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
