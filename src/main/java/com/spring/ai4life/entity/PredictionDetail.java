package com.spring.ai4life.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PredictionDetail {
    private String file;
    private String emotion;
    private double duration;

    public PredictionDetail() {}

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @JsonProperty("emotion")
    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    @JsonProperty("duration")
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}