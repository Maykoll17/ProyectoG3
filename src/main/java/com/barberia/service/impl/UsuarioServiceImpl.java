package com.barberia.service.impl;

import com.barberia.dao.UsuarioDao;
import com.barberia.domain.Usuario;
import com.barberia.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuario.setRol("USER"); 
        usuarioDao.save(usuario);
    }

    @Override
    public Usuario buscarPorUsername(String username) {
        return usuarioDao.findByUsername(username);
    }

    @Override
    public Usuario findByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
