package com.gorbunovav.otp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "send_otp")
public class SendOtpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "process_id")
    private String processId;

    @Column(name = "telegram_chat_id")
    private String telegramChatId;

    @Column(name = "message")
    private String message;

    @Column(name = "length")
    private Integer length;

    @Column(name = "ttl")
    private Integer ttl;

    @Column(name = "resend_attempts")
    private Integer resendAttempts;

    @Column(name = "resend_timeout")
    private Integer resendTimeout;

    @Column(name = "salt")
    private String salt;

    @Column(name = "send_message_key")
    private String sendMessageKey;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OtpStatus status;

    @Column(name = "send_time")
    private LocalDateTime sendTime;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "create_user")
    private String createUser;

    @Column(name = "last_update_time")
    private LocalDateTime lastUpdateTime;

    @Column(name = "last_update_user")
    private String lastUpdateUser;
}
