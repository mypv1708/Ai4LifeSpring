package com.spring.ai4life.enums;

import lombok.Getter;

@Getter
public enum TaskEnum {
    SALE("SALE", "Sale khách hàng"),
    SUPPORT("SUPPORT", "Hỗ trợ");
    private String type;
    private String decription;

    TaskEnum(String type, String decription) {
        this.type = type;
        this.decription = decription;
    }

    TaskEnum() {

    }
}
