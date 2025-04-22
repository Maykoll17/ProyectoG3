package com.barberia.service.impl;

import com.barberia.dao.BarberoDao;
import com.barberia.dao.ResenaDao;
import com.barberia.domain.Barbero;
import com.barberia.service.BarberoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarberoServiceImpl implements BarberoService {

    @Autowired
    private BarberoDao barberoDao;

    @Autowired
    private ResenaDao resenaDao; 

    @Override
    public List<Barbero> listarBarberos() {
        return barberoDao.findAll();
    }

    @Override
    public void guardar(Barbero barbero) {
        barberoDao.save(barbero);
    }

    @Override
    public void eliminar(Barbero barbero) {
 
        resenaDao.deleteByBarbero(barbero);

     
        barberoDao.delete(barbero);
    }

    @Override
    public Barbero encontrarBarbero(Barbero barbero) {
        return barberoDao.findById(barbero.getId()).orElse(null);
    }
}
