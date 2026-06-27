package ru.practicum.main.event.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.main.event.model.Location;
import ru.practicum.main.event.model.StateAdminAction;

import java.time.LocalDateTime;

import static ru.practicum.main.util.Constants.DATE_TIME_PATTERN;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEventAdminRequest {

    @Size(min = 20, max = 2000, message = "Аннотация должна быть 20-2000 символов")
    private String annotation;

    @Positive
    private Long category;

    @Size(min = 20, max = 7000, message = "Описание должно быть 20-7000 символов")
    private String description;

    @Future
    @JsonFormat(pattern = DATE_TIME_PATTERN, shape = JsonFormat.Shape.STRING)
    private LocalDateTime eventDate;

    private Location location;
    private Boolean paid;

    @PositiveOrZero
    private Integer participantLimit;

    private Boolean requestModeration;

    @Size(min = 3, max = 120, message = "Заголовок должен быть 3-120 символов")
    private String title;

    private StateAdminAction stateAction;
}
