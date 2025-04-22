package com.barberia.controller;

import com.barberia.domain.Usuario;
import com.barberia.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro"; // Vista registro.html
    }

    @PostMapping("/registro/guardar")
    public String registrarUsuario(Usuario usuario, Model model) {
        if (usuarioService.buscarPorUsername(usuario.getUsername()) != null) {
            model.addAttribute("error", "El usuario ya existe");
            return "registro";
        }
        usuarioService.registrarUsuario(usuario);
        model.addAttribute("mensaje", "Usuario registrado exitosamente");
        return "redirect:/login";
    }
}
