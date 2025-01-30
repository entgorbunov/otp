package com.gorbunovav.otp.entity;

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
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "send_otp")
public class SendOtp extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String processId;
    private String telegramChatId;
    private String message;
    private Integer length;
    private Integer ttl;
    private Integer resendAttempts;
    private Integer resendTimeout;
    private String salt;
    private String sendMessageKey;

    @Enumerated(EnumType.STRING)
    private OtpStatus status;

    private LocalDateTime sendTime;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SendOtp sendOtp)) return false;
        return Objects.equals(id, sendOtp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "SendOtp{" +
               "id=" + id +
               ", processId='" + processId + '\'' +
               ", telegramChatId='" + telegramChatId + '\'' +
               ", message='" + message + '\'' +
               ", length=" + length +
               ", ttl=" + ttl +
               ", resendAttempts=" + resendAttempts +
               ", resendTimeout=" + resendTimeout +
               ", salt='" + salt + '\'' +
               ", sendMessageKey='" + sendMessageKey + '\'' +
               ", status=" + status +
               ", sendTime=" + sendTime +
               '}';
    }
}
