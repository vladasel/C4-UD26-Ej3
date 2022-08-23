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
	ProductoServiceImpl productoServiceImpl;

	@GetMapping("/productos")
	public List<Producto> listarProductos() {
		return productoServiceImpl.listarProductos();
	}

	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {

		return productoServiceImpl.guardarProducto(producto);
	}

	@GetMapping("/productos/{id}")
	public Producto productoXID(@PathVariable(name = "id") Long id) {

		return productoServiceImpl.productoXID(id);
	}

	@PutMapping("/proyectos/{id}")
	public Producto actualizarProyecto(@PathVariable(name = "id") Long id, @RequestBody Producto producto) {

		Producto seleccionado = new Producto();
		Producto actualizado = new Producto();

		seleccionado = productoServiceImpl.productoXID(id);

		seleccionado.setNombre(producto.getNombre());
		seleccionado.setPrecio(producto.getPrecio());

		actualizado = productoServiceImpl.actualizarProducto(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/productos/{id}")

	public void eleiminarProducto(@PathVariable(name = "id") Long id) {
		productoServiceImpl.eliminarProducto(id);
	}
}
