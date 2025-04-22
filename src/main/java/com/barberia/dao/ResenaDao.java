package com.barberia.dao;

import com.barberia.domain.Barbero;
import com.barberia.domain.Resena;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
    
    @Repository
public interface ResenaDao extends JpaRepository<Resena, Long> {
    
    List<Resena> findByBarberoId(Long id);
    
    void deleteByBarbero(Barbero barbero);
}


