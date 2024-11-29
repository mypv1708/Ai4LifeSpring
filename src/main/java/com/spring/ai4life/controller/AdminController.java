package com.spring.ai4life.controller;

import com.spring.ai4life.common.BaseResponse;
import com.spring.ai4life.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/contact-customer", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<?>> getContactCustomer() {
        return ResponseEntity.ok(adminService.getContactCustomer());
    }

    @RequestMapping(value = "/review-call-detail", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<?>> reviewCallHistory() {
        return ResponseEntity.ok(adminService.reviewCallHistory());
    }

    @RequestMapping(value = "/review-call-detail-by-id", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<?>> reviewCallDetailById(@RequestParam UUID callHistoryId) {
        return ResponseEntity.ok(adminService.reviewCallDetailById(callHistoryId));
    }
}
