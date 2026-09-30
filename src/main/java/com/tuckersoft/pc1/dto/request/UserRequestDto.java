package com.tuckersoft.pc1.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequestDto {
    @NotBlank
    private String username;
    @NotBlank
    @Email(message = "Email tiene que ser válido")
    private String email;
    @NotBlank
    private String password;
}
