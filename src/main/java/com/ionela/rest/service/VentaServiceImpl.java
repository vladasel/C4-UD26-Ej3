package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IVentaDAO;
import com.ionela.rest.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDAO iAsignadoDAO;

	@Override
	public List<Venta> listarAsignados() {
		return iAsignadoDAO.findAll();
	}

	@Override
	public Venta guardarAsignadoA(Venta asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public Venta asignadoXID(Long id) {
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Venta actualizarAsignadoA(Venta asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignadoA(Long id) {
		iAsignadoDAO.deleteById(id);
	}

}
