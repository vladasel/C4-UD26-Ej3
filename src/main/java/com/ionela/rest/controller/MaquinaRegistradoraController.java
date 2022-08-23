package com.ionela.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ionela.rest.dto.MaquinaRegistradora;
import com.ionela.rest.service.MaquinaRegistradoraServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistradoraController {
	@Autowired
	MaquinaRegistradoraServiceImpl maquinaServiceImpl;

	@GetMapping("/maquinas")
	public List<MaquinaRegistradora> listarMaquinaRegistradora() {
		return maquinaServiceImpl.listarMaquinaRegistradora();
	}

	@PostMapping("/maquinas")
	public MaquinaRegistradora salvarMaquinaRegistradora(@RequestBody MaquinaRegistradora maquina_registradora) {

		return maquinaServiceImpl.guardarMaquinaRegistradora(maquina_registradora);
	}

	@GetMapping("/maquinas/{id}")
	public MaquinaRegistradora MaquinaRegistradoraXID(@PathVariable(name = "id") Long id) {

		return maquinaServiceImpl.MaquinaRegistradoraXID(id);
	}

	@PutMapping("/maquinas/{id}")
	public MaquinaRegistradora actualizarMaquinaRegistradora(@PathVariable(name = "id") Long id,
			@RequestBody MaquinaRegistradora maquina_registradora) {

		MaquinaRegistradora seleccionado = new MaquinaRegistradora();
		MaquinaRegistradora actualizado = new MaquinaRegistradora();

		seleccionado = maquinaServiceImpl.MaquinaRegistradoraXID(id);

		seleccionado.setPiso(maquina_registradora.getPiso());

		actualizado = maquinaServiceImpl.actualizarMaquinaRegistradora(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/maquinas/{id}")

	public void eleiminarMaquinaRegistradora(@PathVariable(name = "id") Long id) {
		maquinaServiceImpl.eliminarMaquinaRegistradora(id);
	}

}
