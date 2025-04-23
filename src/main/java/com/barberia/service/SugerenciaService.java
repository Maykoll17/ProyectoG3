package com.barberia.service;

import com.barberia.domain.Sugerencia;
import java.util.List;

public interface SugerenciaService {
    void guardar(Sugerencia sugerencia);
    List<Sugerencia> listar();
}
