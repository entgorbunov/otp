package com.panyukovnn.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
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
public class OtpDtoRequest {

    @NotNull(message = "ProcessId не может быть пустым")
    private UUID processId;

    @NotEmpty(message = "TelegramChatId не может быть пустым")
    private String telegramChatId;

    @NotEmpty(message = "Сообщение не может быть пустым")
    @Pattern(regexp = ".*%s.*", message = "Сообщение должно содержать '%s' для подстановки пароля")
    private String message;

    @Min(value = 4, message = "Длина пароля должна быть от 4 до 8 символов")
    @Max(value = 8, message = "Длина пароля должна быть от 4 до 8 символов")
    private Integer length;

    @Min(value = 30, message = "Срок действия пароля (TTL) должен быть не менее 30 секунд")
    private Integer ttl;

    @Min(value = 1, message = "Количество попыток должно быть от 1 до 3")
    @Max(value = 3, message = "Количество попыток должно быть от 1 до 3")
    private Integer resendAttempts;

    @Min(value = 30, message = "Таймаут между попытками должен быть не менее 30 секунд")
    private Integer resendTimeout;
}
