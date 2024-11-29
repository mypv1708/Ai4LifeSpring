package com.spring.ai4life.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "reviewcall")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewCall {
    @Id
    @Column(name = "review_call_id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID reviewCallId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "callhistory_id")
    private CallHistory callHistory;

    @Column(name = "review_speech")
    private String reviewSpeech;

    @Column(name = "segment_analysis")
    private String segmentAnalysis;

    @Column(name = "review_speech_detail")
    private String reviewSpeechDetail;

    @Column(name = "segment_analysis_detail")
    private String segmentAnalysisDetail;

    @Column(name = "overview_percentage")
    private String overviewPercentage;
}
