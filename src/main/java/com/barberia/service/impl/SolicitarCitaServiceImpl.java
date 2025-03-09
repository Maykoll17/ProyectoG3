package com.barberia.service.impl;

import com.barberia.dao.SolicitarCitaDao;
import com.barberia.domain.SolicitarCita;
import com.barberia.service.SolicitarCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}