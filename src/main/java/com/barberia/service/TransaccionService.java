package com.barberia.service;

import com.barberia.domain.Transaccion;
import java.util.List;

public interface TransaccionService {
    List<Transaccion> listarTransacciones(); 
    void guardarTransaccion(Transaccion transaccion); 
    Transaccion obtenerTransaccionPorId(Long id); 
    void eliminarTransaccion(Long id); 
}