/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.issue;

/**
 * Auto-generated: 2022-05-03 19:33:29
 *
 * @author wangheng
 */
public class TextRange {

    private Integer startLine;
    private Integer endLine;
    private Integer startOffset;
    private Integer endOffset;

    public Integer getStartLine() {
        return startLine;
    }

    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    public Integer getEndLine() {
        return endLine;
    }

    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    public Integer getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Integer startOffset) {
        this.startOffset = startOffset;
    }

    public Integer getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }
}