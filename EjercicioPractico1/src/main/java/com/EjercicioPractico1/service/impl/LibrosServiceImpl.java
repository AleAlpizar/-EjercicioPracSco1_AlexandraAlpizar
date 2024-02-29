/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.service.impl;
/**
 *
 * @author 11alp
 */
import com.EjercicioPractico1.dao.LibrosDao;
import com.EjercicioPractico1.domain.Libros;
import com.EjercicioPractico1.Service.LibrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibrosServiceImpl implements LibrosService{
    
    
    @Autowired//se conecta durectamente con este de abajo
    private LibrosDao listaDao;

    @Transactional(readOnly=true)//dimplemente se lee lo que hay en la base de datos

    @Override
    public List<Libros> getlibros(boolean activos) {
        var lista=listaDao.findAll();//obtenemos todos los objetos de la categoria de la base de datos
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;

    }
}
