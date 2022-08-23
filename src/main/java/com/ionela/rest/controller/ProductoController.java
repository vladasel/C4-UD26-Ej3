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

import com.ionela.rest.dto.Producto;
import com.ionela.rest.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	@Autowired
	ProductoServiceImpl proyectoServiceImpl;

	@GetMapping("/proyectos")
	public List<Producto> listarProyectoos() {
		return proyectoServiceImpl.listarProyectos();
	}

	@PostMapping("/proyectos")
	public Producto salvarProyecto(@RequestBody Producto proyecto) {

		return proyectoServiceImpl.guardarProyecto(proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Producto proyectoXID(@PathVariable(name = "id") String id) {

		return proyectoServiceImpl.proyectoXID(id);
	}

	@PutMapping("/proyectos/{id}")
	public Producto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Producto proyecto) {

		Producto seleccionado = new Producto();
		Producto actualizado = new Producto();

		seleccionado = proyectoServiceImpl.proyectoXID(id);

		seleccionado.setNombre(proyecto.getNombre());
		seleccionado.setHoras(proyecto.getHoras());

		actualizado = proyectoServiceImpl.actualizarProyecto(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/proyectos/{id}")

	public void eleiminarProyecto(@PathVariable(name = "id") String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
}
