package com.barberia.dao;

import com.barberia.domain.Barbero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberoDao extends JpaRepository<Barbero, Long> {
    
}
