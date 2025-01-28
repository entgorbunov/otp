package com.gorbunovav.otp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CheckOtpRequest {

    @NotNull(message = "ProcessId не может быть пустым")
    private UUID processId;

    @NotEmpty(message = "OTP не может быть пустым")
    private String otp;
}
