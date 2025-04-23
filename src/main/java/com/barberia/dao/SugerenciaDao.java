package com.barberia.dao;

import com.barberia.domain.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugerenciaDao extends JpaRepository<Sugerencia, Long> {
}
