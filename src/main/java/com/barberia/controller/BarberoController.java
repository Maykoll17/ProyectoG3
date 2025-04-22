package com.barberia.controller;

import com.barberia.service.BarberoService;
import com.barberia.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BarberoController {

    @Autowired
    private BarberoService barberoService;

    @Autowired
    private ResenaService resenaService;

    @GetMapping("/barberos")
    public String mostrarBarberos(Model model) {
        var barberos = barberoService.listarBarberos();

       
        barberos.forEach(barbero -> {
            var resenas = resenaService.listarResenasPorBarbero(barbero.getId());
            barbero.setResenas(resenas);  
        });

        model.addAttribute("barberos", barberos);
        return "barberos";  
    }
}
