package com.spring.ai4life.dto.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SegmentAnalysist {
    @JsonProperty("data")
    private List<Segment> data;

    public static class Segment {
        private String text;
        private String sentiment;
        private double accuracy;

        public Segment() {
        }

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
}