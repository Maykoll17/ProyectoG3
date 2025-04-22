package com.barberia.service;

import com.barberia.domain.SolicitarCita;

public interface SolicitarCitaService {
    void guardarCita(SolicitarCita cita);
    SolicitarCita obtenerCitaPorId(Long id);
    void eliminarCita(Long id);
}