package com.geewaza.sonarqube.webapi.model.qualitygates;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:01
 **/
public class QualityGates extends Paging {

    private QualityGate[] results;

    public QualityGate[] getResults() {
        return results;
    }

    public void setResults(QualityGate[] results) {
        this.results = results;
    }
}
