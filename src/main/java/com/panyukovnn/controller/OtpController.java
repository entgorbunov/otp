package com.panyukovnn.controller;

import com.panyukovnn.dto.CheckOptDtoRequest;
import com.panyukovnn.dto.OtpDtoRequest;
import com.panyukovnn.dto.common.CommonRequest;
import com.panyukovnn.dto.common.CommonResponse;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/otp")
public class OtpController {

    private final OtpService otpService;

    @PostMapping("/generateAndSend")
    public CommonResponse<Void> generateAndSendOtp(
        @RequestBody @Valid CommonRequest<OtpDtoRequest> request
    ) {
        otpService.generateAndSendOtp(request.getBody());
        request.getBody().getProcessId())

        return CommonResponse.<Void>builder()
            .id(UUID.randomUUID())
            .build();
    }

    @PostMapping("/check")
    public CommonResponse<Void> checkOtp(
        @RequestBody @Valid CommonRequest<CheckOptDtoRequest> request
    ) {
        otpService.checkOtp(request.getBody());
        request.getBody().getProcessId())

        return CommonResponse.<Void>builder()
            .id(UUID.randomUUID())
            .build();
    }
}
