package com.spring.ai4life.service;

import com.spring.ai4life.common.BaseResponse;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    BaseResponse<?> getContactCustomer();
}
