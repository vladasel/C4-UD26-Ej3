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
	CajeroServiceImpl cajeroServiceImpl;

	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros() {
		return cajeroServiceImpl.listarCajeros();
	}

	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {

		return cajeroServiceImpl.guardarCajero(cajero);
	}

	@GetMapping("/cajeros/{id}")
	public Cajero cajeroXID(@PathVariable(name = "id") Long id) {

		return cajeroServiceImpl.cajeroXID(id);
	}

	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") Long id, @RequestBody Cajero cajero) {

		Cajero seleccionado = new Cajero();
		Cajero actualizado = new Cajero();

		seleccionado = cajeroServiceImpl.cajeroXID(id);

		seleccionado.setNom_apell(cajero.getNom_apell());

		actualizado = cajeroServiceImpl.actualizarCajero(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/cajeros/{id}")

	public void eleiminarCientifico(@PathVariable(name = "id") Long id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
}
