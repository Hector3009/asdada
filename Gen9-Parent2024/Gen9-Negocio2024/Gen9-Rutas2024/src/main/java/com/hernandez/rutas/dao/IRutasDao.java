package com.hernandez.rutas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernandez.rutas.models.Ruta;

public interface IRutasDao  extends JpaRepository<Ruta, Long>{
    
}
