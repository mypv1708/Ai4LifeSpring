package com.spring.ai4life.enums;

import lombok.Getter;

@Getter
public enum StatusEnum {
    NONE("NONE", "Chưa thực hiện"),
    DONE("DONE", "Đã thực hiện");
    private String type;
    private String decription;

    StatusEnum(String type, String decription) {
        this.type = type;
        this.decription = decription;
    }

    StatusEnum() {

    }

}
