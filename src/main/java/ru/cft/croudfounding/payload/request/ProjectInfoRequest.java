package ru.cft.croudfounding.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ProjectInfoRequest {

    @JsonProperty("name")
    @Parameter(description = "Название проекта")
    @NotNull
    private String name;

    @JsonProperty("start_date")
    @Parameter(description = "Дата начала сбора")
    @NotNull
    @Valid
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    @Parameter(description = "Дата окончания сбора")
    @NotNull
    @Valid
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime endDate;

    @JsonProperty("required_amount")
    @Parameter(description = "Целое число, сумма сбора")
    @NotNull
    private Long requiredAmount;

    @JsonProperty("collected_amount")
    @Parameter(description = "Целое число, уже собранная сумма")
    @NotNull
    private Long collectedAmount;

    @JsonProperty("description")
    @Parameter(description = "Описание проекта")
    @NotNull
    private String description;

    // TODO: картинки?дополнительные атрибуты
}
