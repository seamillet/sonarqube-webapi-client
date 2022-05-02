/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.measure;
import java.util.List;

/**
 * Auto-generated: 2022-04-29 9:39:59
 *
 * @author wangheng
 */
public class Components {

    private String key;
    private String name;
    private String qualifier;
    private String language;
    private String path;
    private List<Measures> measures;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setQualifier(String qualifier) {
         this.qualifier = qualifier;
     }
     public String getQualifier() {
         return qualifier;
     }

    public void setLanguage(String language) {
         this.language = language;
     }
     public String getLanguage() {
         return language;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setMeasures(List<Measures> measures) {
         this.measures = measures;
     }
     public List<Measures> getMeasures() {
         return measures;
     }

}