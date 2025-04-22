package com.barberia.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Sugerencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String message;
}
