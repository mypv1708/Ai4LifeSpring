package com.spring.ai4life.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID employeeId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "role")
    private Boolean role;

    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;
}
