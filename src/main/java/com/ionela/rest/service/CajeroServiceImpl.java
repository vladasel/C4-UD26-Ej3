package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.ICajeroDAO;
import com.ionela.rest.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCientificoDAO;

	@Override
	public List<Cajero> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cajero guardarCientifico(Cajero cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cajero cientificoXID(String id) {
		// TODO Auto-generated method stub
		return iCientificoDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCientifico(Cajero cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String id) {
		iCientificoDAO.deleteById(id);
	}

}
