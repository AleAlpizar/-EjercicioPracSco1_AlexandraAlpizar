/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.EjercicioPractico1.Service;

/**
 *
 * @author 11alp
 */
import com.EjercicioPractico1.domain.Libros;
import java.util.List;

public interface LibrosService {
    public List<Libros> getlibros(boolean activos); 
}
