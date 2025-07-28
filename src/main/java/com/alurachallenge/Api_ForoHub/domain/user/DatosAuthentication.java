package com.alurachallenge.Api_ForoHub.domain.user;

import jakarta.validation.constraints.NotBlank;

public record DatosAuthentication(
        @NotBlank String email,
        @NotBlank String contrasenia
) {
}
