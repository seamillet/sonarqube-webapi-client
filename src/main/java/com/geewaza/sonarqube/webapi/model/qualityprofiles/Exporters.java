package com.geewaza.sonarqube.webapi.model.qualityprofiles;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:26
 **/
public class Exporters {

    private Loader[] exporters;

    public Loader[] getExporters() {
        return exporters;
    }

    public void setExporters(Loader[] exporters) {
        this.exporters = exporters;
    }
}
