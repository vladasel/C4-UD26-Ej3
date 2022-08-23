package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
