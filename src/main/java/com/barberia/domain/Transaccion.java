package com.barberia.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    public Transaccion() {}

    public Transaccion(Integer cantidad, LocalDateTime fecha, Producto producto) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
