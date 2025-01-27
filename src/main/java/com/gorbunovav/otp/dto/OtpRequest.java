package com.gorbunovav.otp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OtpRequest {

    @NotNull(message = "ProcessId не может быть пустым")
    private UUID processId;

    @NotEmpty(message = "TelegramChatId не может быть пустым")
    private String telegramChatId;

    @NotEmpty(message = "Сообщение не может быть пустым")
    @Pattern(regexp = ".*%s.*", message = "Сообщение должно содержать '%s' для подстановки пароля")
    private String message;

    @NotNull(message = "Длина пароля не может быть пустой")
    @Range(min = 4, max = 8, message = "Длина пароля должна быть от 4 до 8 символов")
    private Integer length;

    @NotNull(message = "Срок действия пароля (TTL) не может быть пустым")
    @Range(min = 30, message = "Срок действия пароля (TTL) должен быть не менее 30 секунд")
    private Integer ttl;

    @NotNull(message = "Количество попыток не может быть пустым")
    @Range(min = 1, max = 3, message = "Количество попыток должно быть от 1 до 3")
    private Integer resendAttempts;

    @NotNull(message = "Таймаут между попытками не может быть пустым")
    @Range(min = 30, message = "Таймаут между попытками должен быть не менее 30 секунд")
    private Integer resendTimeout;
}
