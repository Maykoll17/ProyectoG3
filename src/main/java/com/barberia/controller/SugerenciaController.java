package com.barberia.controller;

import com.barberia.dao.SugerenciaDao;
import com.barberia.domain.Sugerencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/sugerencias")
public class SugerenciaController {

    @Autowired
    private SugerenciaDao sugerenciaRepository;

    @PostMapping("/guardar")
    public String guardarSugerencia(@ModelAttribute Sugerencia sugerencia, Model model) {
        try {
            sugerenciaRepository.save(sugerencia);
            model.addAttribute("success", true);
        } catch (Exception e) {
            model.addAttribute("error", true);
        }
        return "sugerencias"; 
    }
}
