package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IAsignadoADAO;
import com.ionela.rest.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService {

	@Autowired
	IAsignadoADAO iAsignadoDAO;

	@Override
	public List<AsignadoA> listarAsignados() {
		return iAsignadoDAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public AsignadoA asignadoXID(Long id) {
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignadoA(Long id) {
		iAsignadoDAO.deleteById(id);
	}

}
