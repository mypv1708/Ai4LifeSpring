package com.spring.ai4life.dto.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SegmentAnalysist {
    @JsonProperty("detail")
    private List<Segment> detail;

    public static class Segment {
        private String text;
        private String sentiment;
        private double percentNormal;
        private double percentPositive;
        private double percentNegative;

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

        @JsonProperty("percentPositive")
        public double getPercentPositive() {
            return percentPositive;
        }

        public void setPercentPositive(double percentPositive) {
            this.percentPositive = percentPositive;
        }

        @JsonProperty("percentNormal")
        public double getPercentNormal() {
            return percentNormal;
        }

        public void setPercentNormal(double percentNormal) {
            this.percentNormal = percentNormal;
        }

        @JsonProperty("percentNegative")
        public double getPercentNegative() {
            return percentNegative;
        }

        public void setPercentNegative(double percentNegative) {
            this.percentNegative = percentNegative;
        }
    }
}