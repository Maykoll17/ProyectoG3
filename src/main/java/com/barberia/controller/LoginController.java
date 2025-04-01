package com.barberia.controller;

import com.barberia.service.UsuarioService;
import com.barberia.domain.Usuario;
import com.google.cloud.storage.Acl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private UsuarioService userService;
    
    @GetMapping
    public String mostrarFormularioDeInicioDeSesion(Model model) {
        return "login";
    }
    
    @PostMapping
    public String iniciarSesion(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        Usuario user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            
            return "redirect:/";
        } else {
            
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos");
            return "login";
        }
    }
}
