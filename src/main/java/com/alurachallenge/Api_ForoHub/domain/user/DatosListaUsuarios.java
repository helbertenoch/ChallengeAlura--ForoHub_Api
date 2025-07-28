package com.alurachallenge.Api_ForoHub.domain.user;

public record DatosListaUsuarios(
        Long id,
        String nombre,
        String email,
        Perfil perfil
) {
    public DatosListaUsuarios(Usuario usuario) {
        this(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getPerfil()
        );
    }
}
