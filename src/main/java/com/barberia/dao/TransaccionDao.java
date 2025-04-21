package com.barberia.dao;

import com.barberia.domain.Transaccion;
import org.springframework.data.repository.CrudRepository;

public interface TransaccionDao extends CrudRepository<Transaccion, Long> {
}
