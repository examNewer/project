package com.newer.exam.domain;

public class ExercisesClassify {
    private Integer ceId;

    private String ceName;

    public Integer getCeId() {
        return ceId;
    }

    public void setCeId(Integer ceId) {
        this.ceId = ceId;
    }

    public String getCeName() {
        return ceName;
    }

    public void setCeName(String ceName) {
        this.ceName = ceName == null ? null : ceName.trim();
    }
}