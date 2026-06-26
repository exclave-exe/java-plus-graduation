package ru.practicum.main.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

import static ru.practicum.main.util.Constants.DATE_TIME_PATTERN;

@Data
@Builder
public class ApiError {
    private List<StackTraceElement> errors;
    private String status;
    private String reason;
    private String message;
    @JsonFormat(pattern = DATE_TIME_PATTERN)
    private LocalDateTime timestamp;
}

