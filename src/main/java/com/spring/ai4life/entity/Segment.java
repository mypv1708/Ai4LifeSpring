package com.spring.ai4life.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Segment {
    private String text;
    private String sentiment;
    private double accuracy;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("sentiment")
    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    @JsonProperty("accuracy")
    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}
