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

import com.ionela.rest.dto.Cientifico;
import com.ionela.rest.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	@Autowired
	CientificoServiceImpl cientificoServiceImpl;

	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos() {
		return cientificoServiceImpl.listarCientificos();
	}

	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {

		return cientificoServiceImpl.guardarCientifico(cientifico);
	}

	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name = "id") String id) {

		return cientificoServiceImpl.cientificoXID(id);
	}

	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cientifico cientifico) {

		Cientifico seleccionado = new Cientifico();
		Cientifico actualizado = new Cientifico();

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
