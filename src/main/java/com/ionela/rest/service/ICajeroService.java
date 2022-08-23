package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Cajero;

public interface ICajeroService {
	public List<Cajero> listarCajeros();

	public Cajero guardarCajero(Cajero cajero);

	public Cajero cajeroXID(Long id);

	public Cajero actualizarCajero(Cajero cajero);

	public void eliminarCajero(Long id);
}
