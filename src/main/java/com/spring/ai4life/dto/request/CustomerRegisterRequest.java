package com.spring.ai4life.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegisterRequest {
    private String fullName;
    private String phoneNumber;
}
