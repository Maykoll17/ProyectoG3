package com.barberia.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "sugerencia")
public class Sugerencia implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email; // <-- Este campo debe existir

    @Column(length = 1000)
    private String mensaje;

}
