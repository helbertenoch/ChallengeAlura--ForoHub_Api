package com.alurachallenge.Api_ForoHub.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegristoUsuarios(
        @NotBlank String nombre,
        @NotBlank  String email,
        @NotBlank  String contrasenia,
        @NotNull Perfil perfil
) {
}
