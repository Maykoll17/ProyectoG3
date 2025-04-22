package com.barberia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PreguntasFrecuentesController {

    @GetMapping("/preguntasFrecuentes")
    public String mostrarPreguntasFrecuentes() {
        return "preguntasFrecuentes"; 
    }
}
