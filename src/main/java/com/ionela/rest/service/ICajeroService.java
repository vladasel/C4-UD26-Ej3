package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Cajero;

public interface ICajeroService {
	public List<Cajero> listarCientificos();

	public Cajero guardarCientifico(Cajero cientifico);

	public Cajero cientificoXID(String id);

	public Cajero actualizarCientifico(Cajero cientifico);

	public void eliminarCientifico(String id);
}
