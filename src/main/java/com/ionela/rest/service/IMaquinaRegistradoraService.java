package com.ionela.rest.service;

import java.util.List;

import com.ionela.rest.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraService {
	public List<MaquinaRegistradora> listarMaquinaRegistradora();

	public MaquinaRegistradora guardarMaquinaRegistradora(MaquinaRegistradora maquina_registradora);

	public MaquinaRegistradora MaquinaRegistradoraXID(Long id);

	public MaquinaRegistradora actualizarMaquinaRegistradora(MaquinaRegistradora maquina_registradora);

	public void eliminarMaquinaRegistradora(Long id);
}
