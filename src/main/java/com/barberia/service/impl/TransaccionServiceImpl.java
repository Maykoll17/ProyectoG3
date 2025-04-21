package com.barberia.service.impl;

import com.barberia.dao.TransaccionDao;
import com.barberia.domain.Transaccion;
import com.barberia.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServiceImpl implements TransaccionService {

    @Autowired
    private TransaccionDao transaccionDao;

    @Override
    public List<Transaccion> listarTransacciones() {
        return (List<Transaccion>) transaccionDao.findAll();
    }

    @Override
    public void guardar(Transaccion transaccion) {
        transaccionDao.save(transaccion);
    }
}
