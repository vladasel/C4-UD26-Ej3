package com.ionela.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionela.rest.dao.IProductoDAO;
import com.ionela.rest.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO iProyectoDAO;

	@Override
	public List<Producto> listarProyectos() {
		// TODO Auto-generated method stub
		return iProyectoDAO.findAll();
	}

	@Override
	public Producto guardarProyecto(Producto proyecto) {
		// TODO Auto-generated method stub
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Producto proyectoXID(String id) {
		// TODO Auto-generated method stub
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Producto actualizarProyecto(Producto proyecto) {
		// TODO Auto-generated method stub
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		iProyectoDAO.deleteById(id);
	}

}
