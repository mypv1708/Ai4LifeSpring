package com.spring.ai4life.controller;

import com.spring.ai4life.common.BaseResponse;
import com.spring.ai4life.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
