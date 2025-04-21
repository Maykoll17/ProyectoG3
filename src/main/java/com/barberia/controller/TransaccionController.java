package com.barberia.controller;

import com.barberia.domain.Producto;
import com.barberia.domain.Transaccion;
import com.barberia.service.ProductoService;
import com.barberia.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/transacciones")
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public String transaccionesHome() {
        return "transacciones"; // Página de inicio de transacciones
    }

    @GetMapping("/carrito")
    public String verCarrito(Model model) {
        List<Transaccion> transacciones = transaccionService.listarTransacciones();
        model.addAttribute("transacciones", transacciones);
        return "carrito";
    }

    @GetMapping("/nueva")
    public String nuevaTransaccion(Model model) {
        model.addAttribute("transaccion", new Transaccion());
        model.addAttribute("productos", productoService.obtenerTodosLosProductos());
        return "formulario_transaccion";
    }

    @PostMapping("/guardar")
    public String guardarTransaccion(@ModelAttribute Transaccion transaccion) {
        transaccionService.guardar(transaccion);
        return "redirect:/transacciones/carrito";
    }

    @GetMapping("/confirmar")
    public String confirmarCompra(Model model) {
        // Aquí podrías vaciar el carrito o registrar la compra
        model.addAttribute("mensaje", "Compra confirmada");
        return "confirmar_compra";
    }
}
