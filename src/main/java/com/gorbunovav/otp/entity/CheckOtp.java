package com.gorbunovav.otp.entity;

import jakarta.persistence.Entity;
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
@Table(name = "check_otp")
public class CheckOtp extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String processId;
    private String otp;
    private LocalDateTime checkTime;
    private Boolean correct;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CheckOtp checkOtp)) return false;
        return Objects.equals(id, checkOtp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "CheckOtp{" +
               "id=" + id +
               ", processId='" + processId + '\'' +
               ", otp='" + otp + '\'' +
               ", checkTime=" + checkTime +
               ", correct=" + correct +
               '}';
    }
}
