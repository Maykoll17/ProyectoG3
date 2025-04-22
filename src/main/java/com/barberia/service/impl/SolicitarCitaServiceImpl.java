package com.barberia.service.impl;

import com.barberia.dao.SolicitarCitaDao;
import com.barberia.domain.SolicitarCita;
import com.barberia.service.SolicitarCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SolicitarCitaServiceImpl implements SolicitarCitaService {
    private final SolicitarCitaDao solicitarCitaDao;

    @Autowired
    public SolicitarCitaServiceImpl(SolicitarCitaDao solicitarCitaDao) {
        this.solicitarCitaDao = solicitarCitaDao;
    }

    @Override
    public void guardarCita(SolicitarCita cita) {
        solicitarCitaDao.save(cita);
    }

    @Override
    public SolicitarCita obtenerCitaPorId(Long id) {
        Optional<SolicitarCita> cita = solicitarCitaDao.findById(id);
        return cita.orElse(null);
    }

    @Override
    public void eliminarCita(Long id) {
        solicitarCitaDao.deleteById(id);
    }
}