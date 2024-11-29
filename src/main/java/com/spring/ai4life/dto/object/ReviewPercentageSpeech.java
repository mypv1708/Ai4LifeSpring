package com.spring.ai4life.dto.object;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ReviewPercentageSpeech {
    private Map<String, Double> overview_percentage;
}
