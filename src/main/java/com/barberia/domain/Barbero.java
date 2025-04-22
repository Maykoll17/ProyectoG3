package com.barberia.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Barbero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int experiencia;
    private String foto;
    private String especialidades; 
    @Column(length = 1000)
    private String descripcion; 

    @OneToMany(mappedBy = "barbero", cascade = CascadeType.ALL)
    private List<Resena> resenas;

  
    public Barbero() {}

   
    public Barbero(Long id, String nombre, int experiencia, String foto, String especialidades, String descripcion, List<Resena> resenas) {
        this.id = id;
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.foto = foto;
        this.especialidades = especialidades;
        this.descripcion = descripcion;
        this.resenas = resenas;
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(List<Resena> resenas) {
        this.resenas = resenas;
    }
}