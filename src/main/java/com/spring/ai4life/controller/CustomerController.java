package com.spring.ai4life.controller;

import com.spring.ai4life.common.BaseResponse;
import com.spring.ai4life.dto.request.CustomerRegisterRequest;
import com.spring.ai4life.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<BaseResponse<?>> register(@RequestBody CustomerRegisterRequest request) {
        return ResponseEntity.ok(customerService.register(request));
    }
}