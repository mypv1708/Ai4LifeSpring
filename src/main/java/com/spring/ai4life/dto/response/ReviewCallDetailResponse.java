package com.spring.ai4life.dto.response;

import com.spring.ai4life.entity.ReviewSpeech;
import com.spring.ai4life.entity.ReviewSpeechDetail;
import com.spring.ai4life.entity.SegmentAnalysist;
import com.spring.ai4life.enums.TaskEnum;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class ReviewCallDetailResponse {
    private UUID callHistoryId;
    private String fullNameEmployee;
    private Timestamp calledTime;
    private TaskEnum typeTask;

    private String fileName;
    private String durationFile;

    private String reviewSpeech;
    private String segmentAnalysis;
    private String reviewSpeechDetail;
    private String segmentAnalysisDetail;

    private ReviewSpeech reviewSpeechObject;
    private SegmentAnalysist segmentAnalysisObject;
    private ReviewSpeechDetail reviewSpeechDetailObject;

    public ReviewCallDetailResponse(UUID callHistoryId, String fullNameEmployee, Timestamp calledTime, TaskEnum typeTask, String fileName, String durationFile, String reviewSpeech, String segmentAnalysis, String reviewSpeechDetail, String segmentAnalysisDetail) {
        this.callHistoryId = callHistoryId;
        this.fullNameEmployee = fullNameEmployee;
        this.calledTime = calledTime;
        this.typeTask = typeTask;
        this.fileName = fileName;
        this.durationFile = durationFile;
        this.reviewSpeech = reviewSpeech;
        this.segmentAnalysis = segmentAnalysis;
        this.reviewSpeechDetail = reviewSpeechDetail;
        this.segmentAnalysisDetail = segmentAnalysisDetail;
    }
}
