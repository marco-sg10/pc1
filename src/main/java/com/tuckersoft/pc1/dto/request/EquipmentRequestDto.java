package com.tuckersoft.pc1.dto.request;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EquipmentRequestDto {
    @NotBlank
    private String equipmentCode;
    @NotNull
    private ZonedDateTime startTime;
    @NotNull
    private ZonedDateTime endTime;

    @Min(value = 1, message = "La capacidad no puede ser menor a 1")
    private Integer capacity;

    @AssertTrue
    private boolean isAvailable;
}
