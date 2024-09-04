package com.hernandez.camiones.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hernandez.camiones.dao.iCamionesDao;
import com.hernandez.camiones.models.Camion;

@Component //Ayuda a ser inyectado como dependencia
public class CamionesService {
    @Autowired
    iCamionesDao camionesDao;


    public List<Camion> getAll() {
        List<Camion> listado = new ArrayList<>();
        listado = this.camionesDao.findAll();
        return listado;
    }


    public Optional<Camion> findById(Long id) {
        Optional<Camion> find = this.camionesDao.findById(id);
        if(find.isPresent()){
            return find;
        }
        return Optional.empty();
    }


    public Camion save(Camion t) {
        return this.camionesDao.save(t);
    }


    public void delete(Camion t) {
        this.camionesDao.delete(t);
    }


}
