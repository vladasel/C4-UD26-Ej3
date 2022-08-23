package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.AsignadoA;

public interface IAsignadoAService {
	public List<AsignadoA> listarAsignados();

	public AsignadoA guardarAsignadoA(AsignadoA asignado);

	public AsignadoA asignadoXID(Long id);

	public AsignadoA actualizarAsignadoA(AsignadoA asignado);

	public void eliminarAsignadoA(Long id);
}
