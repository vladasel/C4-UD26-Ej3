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

import com.ionela.rest.dto.Venta;
import com.ionela.rest.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class ValorController {
	@Autowired
	VentaServiceImpl asignadoServiceImpl;

	@GetMapping("/asignados")
	public List<Venta> listarAsignados() {
		return asignadoServiceImpl.listarAsignados();
	}

	@PostMapping("/asignados")
	public Venta salvarAsignadoA(@RequestBody Venta asignado) {

		return asignadoServiceImpl.guardarAsignadoA(asignado);
	}

	@GetMapping("/asignados/{id}")
	public Venta asignadoXID(@PathVariable(name = "id") Long id) {

		return asignadoServiceImpl.asignadoXID(id);
	}

	@PutMapping("/asignados/{id}")
	public Venta actualizarAsignadoA(@PathVariable(name = "id") Long id, @RequestBody Venta asignado) {

		Venta seleccionado = new Venta();
		Venta actualizado = new Venta();

		seleccionado = asignadoServiceImpl.asignadoXID(id);

		seleccionado.setCientifico(asignado.getCientifico());
		seleccionado.setProyecto(asignado.getProyecto());

		actualizado = asignadoServiceImpl.actualizarAsignadoA(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/asignados/{id}")

	public void eleiminarPieza(@PathVariable(name = "id") Long id) {
		asignadoServiceImpl.eliminarAsignadoA(id);
	}
}
