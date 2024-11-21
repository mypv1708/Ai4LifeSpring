package com.spring.ai4life.service.impl;

import com.spring.ai4life.common.BaseResponse;
import com.spring.ai4life.constants.MessageUnit;
import com.spring.ai4life.dto.response.ContactCustomerResponse;
import com.spring.ai4life.entity.CallHistory;
import com.spring.ai4life.repository.CallHistoryRepository;
import com.spring.ai4life.service.AdminService;
import com.spring.ai4life.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CallHistoryRepository callHistoryRepository;

    public AdminServiceImpl(CallHistoryRepository callHistoryRepository) {
        this.callHistoryRepository = callHistoryRepository;
    }

    @Override
    public BaseResponse<?> getContactCustomer() {
        try {
            List<CallHistory> lisUnmadeCalls = callHistoryRepository.getLisUnmadeCalls();
            if (!lisUnmadeCalls.isEmpty()) {
                List<ContactCustomerResponse> responses = new ArrayList<>();
                for (CallHistory callHistory : lisUnmadeCalls) {
                    ContactCustomerResponse contactCustomerResponse = new ContactCustomerResponse();
                    contactCustomerResponse.setCallHistoryId(callHistory.getCallHistoryId());
                    contactCustomerResponse.setFullName(callHistory.getCustomer().getFullName());
                    contactCustomerResponse.setPhoneNumber(callHistory.getCustomer().getPhoneNumber());
                    contactCustomerResponse.setTypeTask(callHistory.getTypeTask().getDecription());
                    contactCustomerResponse.setTypeStatus(callHistory.getTypeStatus().getDecription());
                    contactCustomerResponse.setCreatedAt(callHistory.getCreatedAt());
                    responses.add(contactCustomerResponse);
                }


                log.info("[INFO] [AdminServiceImp] [getContactCustomer] : Lấy danh sách thành công!!");
                return new BaseResponse<>().success(responses);
            } else {
                log.error("[ERROR] [AdminServiceImp] [getContactCustomer]: " + MessageUnit.MESSAGE_VI_NO_DATA);
                return new BaseResponse<>().error(MessageUnit.NO_DATA, MessageUnit.MESSAGE_VI_NO_DATA, MessageUnit.MESSAGE_EN_NO_DATA, null);
            }
        } catch (Exception e) {
            log.error("[ERROR] [AdminServiceImp] [getContactCustomer]: " + e.getMessage());
            return new BaseResponse<>().error(MessageUnit.INTERNAL_ERROR_SERVER, MessageUnit.MESSAGE_VI_INTERNAL_ERROR_SERVER, MessageUnit.MESSAGE_EN_INTERNAL_ERROR_SERVER, null);

        }
    }
}
