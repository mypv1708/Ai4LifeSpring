package com.spring.ai4life.service;

import com.spring.ai4life.common.BaseResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface AdminService {
    BaseResponse<?> getContactCustomer();

    BaseResponse<?> reviewCallHistory();

    BaseResponse<?> reviewCallDetailById(UUID callHistoryId);
}
