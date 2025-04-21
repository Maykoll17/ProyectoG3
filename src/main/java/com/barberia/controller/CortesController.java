package com.barberia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CortesController {

    @GetMapping("/cortes")
    public String mostrarCortes() {
        return "cortes"; 
    }
}