package com.hernandez.camiones.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernandez.camiones.models.Camion;

public interface iCamionesDao extends JpaRepository<Camion, Long>{
    
}
