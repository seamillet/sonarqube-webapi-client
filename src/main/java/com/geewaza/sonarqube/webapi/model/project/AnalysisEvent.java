package com.geewaza.sonarqube.webapi.model.project;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:22
 **/
public class AnalysisEvent {
    private String analysis;
    private String key;
    private String category;
    private String name;
    private String description;
    private QualityGateEvent qualityGate;

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QualityGateEvent getQualityGate() {
        return qualityGate;
    }

    public void setQualityGate(QualityGateEvent qualityGate) {
        this.qualityGate = qualityGate;
    }
}
