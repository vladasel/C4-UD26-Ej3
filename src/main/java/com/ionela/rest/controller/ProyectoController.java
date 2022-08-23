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

import com.ionela.rest.dto.Proyecto;
import com.ionela.rest.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;

	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectoos() {
		return proyectoServiceImpl.listarProyectos();
	}

	@PostMapping("/proyectos")
	public Proyecto salvarProyecto(@RequestBody Proyecto proyecto) {

		return proyectoServiceImpl.guardarProyecto(proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name = "id") String id) {

		return proyectoServiceImpl.proyectoXID(id);
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyecto proyecto) {

		Proyecto seleccionado = new Proyecto();
		Proyecto actualizado = new Proyecto();

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
