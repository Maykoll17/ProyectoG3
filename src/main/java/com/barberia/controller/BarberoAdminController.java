package com.barberia.controller;

import com.barberia.domain.Barbero;
import com.barberia.service.BarberoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/barberos")
public class BarberoAdminController {

    @Autowired
    private BarberoService barberoService;

    @GetMapping
    public String listarBarberos(Model model) {
        var barberos = barberoService.listarBarberos();
        model.addAttribute("barberos", barberos);
        return "admin/barberos/listado";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("barbero", new Barbero());
        return "admin/barberos/formulario";
    }

    @PostMapping("/guardar")
    public String guardarBarbero(@ModelAttribute Barbero barbero) {
        barberoService.guardar(barbero);
        return "redirect:/admin/barberos";
    }

    @GetMapping("/modificar/{id}")
    public String mostrarFormularioModificar(@PathVariable("id") Long id, Model model) {
        Barbero barbero = new Barbero();
        barbero.setId(id);
        barbero = barberoService.encontrarBarbero(barbero);
        model.addAttribute("barbero", barbero);
        return "admin/barberos/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarBarbero(@PathVariable("id") Long id) {
        Barbero barbero = new Barbero();
        barbero.setId(id);
        barberoService.eliminar(barbero);
        return "redirect:/admin/barberos";
    }
}