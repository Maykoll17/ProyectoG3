
package com.barberia.service;

import com.barberia.domain.Usuario;
import com.google.cloud.storage.Acl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barberia.dao.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository userRepository;
    
    public Usuario findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
