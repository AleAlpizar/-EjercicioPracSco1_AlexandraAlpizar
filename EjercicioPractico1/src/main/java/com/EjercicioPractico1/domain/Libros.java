/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.domain;

/**
 *
 * @author 11alp
 */
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="libros")
public class Libros implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="libros")
    private Long id;
    private String titulo;
    private String autor;
    private String precio;
    private String categoria;
    private boolean activo;

     public Libros(){
}
    
     public Libros(String libros, boolean activo) {
        this.autor = libros;
        this.activo = activo;
    }
     
}
