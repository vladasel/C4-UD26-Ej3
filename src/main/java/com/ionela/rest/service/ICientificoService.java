package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.Cientifico;

public interface ICientificoService {
	public List<Cientifico> listarCientificos();

	public Cientifico guardarCientifico(Cientifico cientifico);

	public Cientifico cientificoXID(String id);

	public Cientifico actualizarCientifico(Cientifico cientifico);

	public void eliminarCientifico(String id);
}
