package com.barberia.service.impl;

import com.barberia.dao.TransaccionDao;
import com.barberia.domain.Transaccion;
import com.barberia.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransaccionServiceImpl implements TransaccionService {

    private final TransaccionDao transaccionDao;

    @Autowired
    public TransaccionServiceImpl(TransaccionDao transaccionDao) {
        this.transaccionDao = transaccionDao;
    }

    @Override
    public List<Transaccion> listarTransacciones() {
        return (List<Transaccion>) transaccionDao.findAll(); 
    }

    @Override
    public void guardarTransaccion(Transaccion transaccion) {
        transaccionDao.save(transaccion); 
    }

    @Override
    public Transaccion obtenerTransaccionPorId(Long id) {
        Optional<Transaccion> transaccion = transaccionDao.findById(id); 
        return transaccion.orElse(null); 
    }

    @Override
    public void eliminarTransaccion(Long id) {
        transaccionDao.deleteById(id); 
    }
}
