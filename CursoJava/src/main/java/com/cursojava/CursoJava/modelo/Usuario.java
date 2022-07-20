package com.cursojava.CursoJava.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="usuarios")
@Data @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="nombre")
    private String nombre;

    /*@Getter @Setter*/ @Column(name="apellido")
    private String apellido;

    /*@Getter @Setter*/ @Column(name="email")
    private String email;

    /*@Getter @Setter*/ @Column(name="telefono")
    private String telefono;

    /*@Getter @Setter*/ @Column(name="password")
    private String password;

    
}
