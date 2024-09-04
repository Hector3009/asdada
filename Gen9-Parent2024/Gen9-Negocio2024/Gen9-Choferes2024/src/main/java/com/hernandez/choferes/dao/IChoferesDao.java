package com.hernandez.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hernandez.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer, Long> {

}
