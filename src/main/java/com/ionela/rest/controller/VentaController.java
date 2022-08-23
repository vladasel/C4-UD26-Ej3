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
public class VentaController {
	@Autowired
	VentaServiceImpl ventaServiceImpl;

	@GetMapping("/ventas")
	public List<Venta> listarVenta() {
		return ventaServiceImpl.listarVenta();
	}

	@PostMapping("/ventas")
	public Venta salvarVenta(@RequestBody Venta venta) {

		return ventaServiceImpl.guardarVenta(venta);
	}

	@GetMapping("/ventas/{id}")
	public Venta ventaXID(@PathVariable(name = "id") Long id) {

		return ventaServiceImpl.ventaXID(id);
	}

	@PutMapping("/ventas/{id}")
	public Venta actualizarVenta(@PathVariable(name = "id") Long id, @RequestBody Venta venta) {

		Venta seleccionado = new Venta();
		Venta actualizado = new Venta();

		seleccionado = ventaServiceImpl.ventaXID(id);

		seleccionado.setCajero(venta.getCajero());
		seleccionado.setProducto(venta.getProducto());
		seleccionado.setMaquina_registradora(venta.getMaquina_registradora());

		actualizado = ventaServiceImpl.actualizarVenta(seleccionado);

		return actualizado;
	}

	@DeleteMapping("/ventas/{id}")

	public void eleiminarVenta(@PathVariable(name = "id") Long id) {
		ventaServiceImpl.eliminarVenta(id);
	}
}
