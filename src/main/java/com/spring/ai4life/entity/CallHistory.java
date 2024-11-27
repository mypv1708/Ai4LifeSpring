package com.spring.ai4life.entity;

import com.spring.ai4life.enums.StatusEnum;
import com.spring.ai4life.enums.TaskEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "callhistory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CallHistory {
    @Id
    @Column(name = "callhistory_id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID callHistoryId;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_task")
    private TaskEnum typeTask;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_status")
    private StatusEnum typeStatus;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "duration")
    private String duration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = true)
    private Employee employee;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
