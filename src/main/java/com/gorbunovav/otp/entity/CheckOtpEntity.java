package com.gorbunovav.otp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "check_otp")
public class CheckOtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "process_id")
    private String processId;

    @Column(name = "otp")
    private String otp;

    @Column(name = "check_time")
    private LocalDateTime checkTime;

    @Column(name = "correct")
    private Boolean correct;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "last_update_time")
    private LocalDateTime lastUpdateTime;

    @Column(name = "last_update_user")
    private String lastUpdateUser;
}
