package com.geewaza.sonarqube.webapi.model.qualitygates;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:01
 **/
public class QualityGateInfoList {

    private QualityGateInfo[] qualitygates;

    @JSONField(name = "default")
    private Integer defaultNum;

    private Action action;

    public QualityGateInfo[] getQualitygates() {
        return qualitygates;
    }

    public void setQualitygates(QualityGateInfo[] qualitygates) {
        this.qualitygates = qualitygates;
    }

    public Integer getDefaultNum() {
        return defaultNum;
    }

    public void setDefaultNum(Integer defaultNum) {
        this.defaultNum = defaultNum;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
