package com.ionela.rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajero cajero;

	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "maquina_registradora")
	private MaquinaRegistradora maquina_registradora;

	public Venta() {
	}

	public Venta(Long id, Cajero cajero, Producto producto, MaquinaRegistradora maquina_registradora) {
		this.id = id;
		this.cajero = cajero;
		this.producto = producto;
		this.maquina_registradora = maquina_registradora;
	}

	public Long getId() {
		return id;
	}

	

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public MaquinaRegistradora getMaquina_registradora() {
		return maquina_registradora;
	}

	public void setMaquina_registradora(MaquinaRegistradora maquina_registradora) {
		this.maquina_registradora = maquina_registradora;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", producto=" + producto + ", maquina_registradora="
				+ maquina_registradora + "]";
	}
	

}
