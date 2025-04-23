package com.barberia.controller;

import com.barberia.domain.Sugerencia;
import com.barberia.service.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sugerencias")
public class SugerenciaController {

    @Autowired
    private SugerenciaService sugerenciaService;

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("sugerencia", new Sugerencia());
        return "sugerencias/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(Sugerencia sugerencia) {
        sugerenciaService.guardar(sugerencia);
        return "redirect:/sugerencias";
    }
}
