package com.geewaza.sonarqube.webapi.model.measure;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 22:21
 **/
public class ComponentMeasuresHistory extends Paging {

    private MeasureHistory[] measures;

    public MeasureHistory[] getMeasures() {
        return measures;
    }

    public void setMeasures(MeasureHistory[] measures) {
        this.measures = measures;
    }
}
