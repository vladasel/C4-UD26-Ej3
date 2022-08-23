package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.ICajeroDAO;
import com.ionela.rest.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajero> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(Long id) {
		// TODO Auto-generated method stub
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(Long id) {
		iCajeroDAO.deleteById(id);
	}

}
