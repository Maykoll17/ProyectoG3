package com.barberia.service;

import com.barberia.domain.Usuario;

public interface UsuarioService {
    void registrarUsuario(Usuario usuario);
    Usuario buscarPorUsername(String username);

    public Usuario findByUsername(String username);
}
