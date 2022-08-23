package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IMaquinaRegistradoraDAO;
import com.ionela.rest.dto.MaquinaRegistradora;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService{

	@Autowired
	IMaquinaRegistradoraDAO iMaquinaRegistradoraDAO;
	
	@Override
	public List<MaquinaRegistradora> listarMaquinaRegistradora() {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquina_registradora) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.save(maquina_registradora);
	}

	@Override
	public MaquinaRegistradora MaquinaRegistradoraXID(Long id) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.findById(id).get();
	}

	@Override
	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquina_registradora) {
		// TODO Auto-generated method stub
		return iMaquinaRegistradoraDAO.save(maquina_registradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(Long id) {
		iMaquinaRegistradoraDAO.deleteById(id);		
	}

}
