package ru.cft.croudfounding.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Setter
@Getter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class ProjectUnitImportDTO {
    @JsonProperty("name")
    @Parameter(description = " Название проекта.")
    @NotNull
    private String name;

    @JsonProperty("Start date")
    @Parameter(description = " Дата начала сбора.")
    @NotNull
    @Valid
    private LocalDateTime date;

    @JsonProperty("End date")
    @Parameter(description = " Дата окончания сбора.")
    @NotNull
    @Valid
    private LocalDateTime endDate;

    @JsonProperty("parentId")
    @Parameter(description = " Уникальный идентификатор пользователя владельца.")
    @NotNull
    private Long parentId;

    @JsonProperty("parentName")
    @Parameter(description = " Фио идентификатор пользователя владельца.")
    @NotNull
    private String parentName;

    @JsonProperty("required amount")
    @Parameter(description = "Целое число, сумма сбора.")
    @NotNull
    private Long requiredAmount;

    @JsonProperty("collected amount")
    @Parameter(description = "Целое число, уже собранная сумма.")
    @NotNull
    private Long collectedAmount;

    @JsonProperty("Description")
    @Parameter(description = "Описание проекта")
    @NotNull
    private String description;

    //TODO: картинки?дополнительные атрибуты
}