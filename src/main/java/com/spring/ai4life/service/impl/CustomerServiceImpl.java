package com.spring.ai4life.service.impl;

import com.spring.ai4life.common.BaseResponse;
import com.spring.ai4life.constants.MessageUnit;
import com.spring.ai4life.dto.request.CustomerRegisterRequest;
import com.spring.ai4life.entity.CallHistory;
import com.spring.ai4life.entity.Customer;
import com.spring.ai4life.enums.StatusEnum;
import com.spring.ai4life.enums.TaskEnum;
import com.spring.ai4life.repository.CallHistoryRepository;
import com.spring.ai4life.repository.CustomerRepository;
import com.spring.ai4life.service.CustomerService;
import com.spring.ai4life.utils.ValidateRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class CustomerServiceImpl implements CustomerService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;
    private final CallHistoryRepository callHistoryRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, CallHistoryRepository callHistoryRepository) {
        this.customerRepository = customerRepository;
        this.callHistoryRepository = callHistoryRepository;
    }

    @Override
    public BaseResponse<?> register(CustomerRegisterRequest request) {
        // Validate Empty
        if (!ValidateRequest.isNotEmpty(request.getFullName())) {
            log.error("[ERROR] [CustomerServiceImpl] [register] " + "FullName: " + MessageUnit.MESSAGE_VI_REQUIRED_FIELDS);
            return new BaseResponse<>().error(MessageUnit.REQUIRED_FIELDS, "Họ tên : " + MessageUnit.MESSAGE_VI_REQUIRED_FIELDS, "FullName : " + MessageUnit.MESSAGE_EN_REQUIRED_FIELDS, null);
        }

        if (!ValidateRequest.isNotEmpty(request.getPhoneNumber())) {
            log.error("[ERROR] [CustomerServiceImpl] [register] " + "PhoneNumber: " + MessageUnit.MESSAGE_VI_REQUIRED_FIELDS);
            return new BaseResponse<>().error(MessageUnit.REQUIRED_FIELDS, "Số điện thoại : " + MessageUnit.MESSAGE_VI_REQUIRED_FIELDS, "PhoneNumber : " + MessageUnit.MESSAGE_EN_REQUIRED_FIELDS, null);
        }

        try {
            Customer customer = new Customer();
            customer.setFullName(request.getFullName());
            customer.setPhoneNumber(request.getPhoneNumber());
            customer.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            customerRepository.save(customer);

            CallHistory callHistory = new CallHistory();
            callHistory.setCustomer(customer);
            callHistory.setTypeTask(TaskEnum.SALE);
            callHistory.setTypeStatus(StatusEnum.NONE);
            callHistory.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            callHistoryRepository.save(callHistory);
            return new BaseResponse<>().success(customer);

        } catch (Exception e) {
            log.error("[ERROR] [CustomerServiceImpl] [register] " + e.getMessage(), e);
            return new BaseResponse<>().error(MessageUnit.INTERNAL_ERROR_SERVER, MessageUnit.MESSAGE_VI_INTERNAL_ERROR_SERVER, MessageUnit.MESSAGE_EN_INTERNAL_ERROR_SERVER, null);
        }
    }
}
