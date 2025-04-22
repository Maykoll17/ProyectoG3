package com.barberia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipoController {

    @GetMapping("/equipo")
    public String mostrarEquipo() {
        return "equipo"; 
    }
}
