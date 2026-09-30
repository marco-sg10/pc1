package com.tuckersoft.pc1.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReservaRequestDto {
    @NotBlank
    @Max(value = 250, message = "El propósito no puede tener más de 250 caracteres")
    private String purpose;
}
