package com.spring.ai4life.service;

import com.spring.ai4life.common.BaseResponse;
import com.spring.ai4life.dto.request.CustomerRegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    BaseResponse<?> register(CustomerRegisterRequest request);
}
