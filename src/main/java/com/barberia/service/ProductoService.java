
package com.barberia.service;

import com.barberia.domain.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> obtenerTodosLosProductos();
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);
    Producto obtenerProductoPorId(Long id);
}
