package com.barberia.domain;

import jakarta.persistence.*;

@Entity
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentario;
    private int calificacion;

    @ManyToOne
    @JoinColumn(name = "barbero_id")
    private Barbero barbero;


    public Resena() {}

  
    public Resena(Long id, String comentario, int calificacion, Barbero barbero) {
        this.id = id;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.barbero = barbero;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }
}
