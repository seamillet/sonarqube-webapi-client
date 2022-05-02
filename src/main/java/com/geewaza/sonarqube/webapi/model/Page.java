/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model;

/**
 * Auto-generated: 2022-04-29 9:39:59
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Page {

    private int pageIndex;
    private int pageSize;
    private int total;

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

}