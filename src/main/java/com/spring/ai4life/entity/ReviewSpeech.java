package com.spring.ai4life.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class ReviewSpeech {
    private Map<String, Double> emotion_percentages;
}
