package com.ionela.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private int piso;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "maquina_registradora")
	private List<Venta> ventas;



	public MaquinaRegistradora(Long id, int piso, List<Venta> ventas) {
		this.id = id;
		this.piso = piso;
		this.ventas = ventas;
	}

	public MaquinaRegistradora() {
	}

	public Long getId() {
		return id;
	}


	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "MaquinaRegistradora [id=" + id + ", piso=" + piso + ", ventas=" + ventas + "]";
	}

}
