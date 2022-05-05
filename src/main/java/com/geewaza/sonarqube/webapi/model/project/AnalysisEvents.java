package com.geewaza.sonarqube.webapi.model.project;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:22
 **/
public class AnalysisEvents extends Paging {
    private AnalysisEvent[] analyses;

    public AnalysisEvent[] getAnalyses() {
        return analyses;
    }

    public void setAnalyses(AnalysisEvent[] analyses) {
        this.analyses = analyses;
    }
}
