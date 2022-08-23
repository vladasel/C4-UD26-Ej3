package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Venta;

public interface IVentaService {
	public List<Venta> listarAsignados();

	public Venta guardarAsignadoA(Venta asignado);

	public Venta asignadoXID(Long id);

	public Venta actualizarAsignadoA(Venta asignado);

	public void eliminarAsignadoA(Long id);
}
