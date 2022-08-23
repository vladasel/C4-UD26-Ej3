package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Producto;

public interface IProductoService {
	public List<Producto> listarProductos();

	public Producto guardarProducto(Producto producto);

	public Producto productoXID(Long id);

	public Producto actualizarProducto(Producto producto);

	public void eliminarProducto(Long id);
}
