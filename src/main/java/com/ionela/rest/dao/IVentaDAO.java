package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta,Long>{

}
