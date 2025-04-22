package com.barberia.service.impl;

import com.barberia.dao.ResenaDao;
import com.barberia.domain.Resena;
import com.barberia.service.ResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaServiceImpl implements ResenaService {

    @Autowired
    private ResenaDao resenaDao;

    @Override
    public List<Resena> listarResenasPorBarbero(Long barberoId) {
        return resenaDao.findByBarberoId(barberoId);
    }
}