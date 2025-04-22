package com.barberia.service;

import com.barberia.domain.Resena;
import java.util.List;

public interface ResenaService {
    List<Resena> listarResenasPorBarbero(Long barberoId);
}
