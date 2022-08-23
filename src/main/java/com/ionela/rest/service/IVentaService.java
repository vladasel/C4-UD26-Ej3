package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Venta;

public interface IVentaService {
	public List<Venta> listarVenta();

	public Venta guardarVenta(Venta venta);

	public Venta ventaXID(Long id);

	public Venta actualizarVenta(Venta venta);

	public void eliminarVenta(Long id);
}
