package com.barberia.dao;

import com.barberia.domain.SolicitarCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitarCitaDao extends JpaRepository<SolicitarCita, Long> {

}