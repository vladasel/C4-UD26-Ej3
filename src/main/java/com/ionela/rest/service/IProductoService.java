package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Producto;

public interface IProductoService {
	public List<Producto> listarProyectos();

	public Producto guardarProyecto(Producto proyecto);

	public Producto proyectoXID(String id);

	public Producto actualizarProyecto(Producto proyecto);

	public void eliminarProyecto(String id);
}
