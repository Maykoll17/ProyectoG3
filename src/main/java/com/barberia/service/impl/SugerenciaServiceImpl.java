package com.barberia.service.impl;

import com.barberia.dao.SugerenciaDao;
import com.barberia.domain.Sugerencia;
import com.barberia.service.SugerenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SugerenciaServiceImpl implements SugerenciaService {

    @Autowired
    private SugerenciaDao sugerenciaDao;

    @Override
    public void guardar(Sugerencia sugerencia) {
        sugerenciaDao.save(sugerencia);
    }

    @Override
    public List<Sugerencia> listar() {
        return sugerenciaDao.findAll();
    }
}
