package com.barberia.service;

import com.barberia.domain.Barbero;
import java.util.List;

public interface BarberoService {
    public List<Barbero> listarBarberos();
    public void guardar(Barbero barbero);
    public void eliminar(Barbero barbero);
    public Barbero encontrarBarbero(Barbero barbero);
}
