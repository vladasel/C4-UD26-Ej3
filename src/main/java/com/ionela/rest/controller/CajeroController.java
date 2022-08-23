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

import com.ionela.rest.dto.Cajero;
import com.ionela.rest.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {
	@Autowired
	CajeroServiceImpl cientificoServiceImpl;

	@GetMapping("/cientificos")
	public List<Cajero> listarCientificos() {
		return cientificoServiceImpl.listarCientificos();
	}

	@PostMapping("/cientificos")
	public Cajero salvarCientifico(@RequestBody Cajero cientifico) {

		return cientificoServiceImpl.guardarCientifico(cientifico);
	}

	@GetMapping("/cientificos/{id}")
	public Cajero cientificoXID(@PathVariable(name = "id") String id) {

		return cientificoServiceImpl.cientificoXID(id);
	}

	@PutMapping("/cientificos/{id}")
	public Cajero actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cajero cientifico) {

		Cajero seleccionado = new Cajero();
		Cajero actualizado = new Cajero();

		seleccionado = cientificoServiceImpl.cientificoXID(id);

		seleccionado.setNom_apell(cientifico.getNom_apell());

		actualizado = cientificoServiceImpl.actualizarCientifico(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/cientificos/{id}")

	public void eleiminarCientifico(@PathVariable(name = "id") String id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}
}
