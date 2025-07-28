package com.alurachallenge.Api_ForoHub.domain.respuesta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegristoRespuesta(
        @NotBlank String mensaje,
        @NotNull Long topicoId,
        @NotNull Long autorId,
        String solucion
) {
}
