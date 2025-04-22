/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barberia.service.impl;

import com.barberia.domain.Producto;
import com.barberia.dao.ProductoDao;
import com.barberia.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoDao productoDao;

    @Autowired
    public ProductoServiceImpl(ProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoDao.deleteById(id);
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        Optional<Producto> producto = productoDao.findById(id);
        return producto.orElse(null);  // Manejar casos donde no se encuentra el producto
    }
}