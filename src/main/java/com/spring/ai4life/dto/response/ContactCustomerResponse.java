package com.spring.ai4life.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
public class ContactCustomerResponse {
    private UUID callHistoryId;
    private String typeTask;
    private String typeStatus;
    private String fullName;
    private String phoneNumber;
    private Timestamp createdAt;
}
