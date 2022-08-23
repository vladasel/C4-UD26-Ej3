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
@Table(name = "cajeros")
public class Cajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nom_apell;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajero")
	private List<Venta> ventas;

	public Cajero(Long id, String nom_apell, List<Venta> ventas) {
		this.id = id;
		this.nom_apell = nom_apell;
		this.ventas = ventas;
	}

	public Cajero() {
	}

	public Long getId() {
		return id;
	}

	public String getNom_apell() {
		return nom_apell;
	}

	public void setNom_apell(String nom_apell) {
		this.nom_apell = nom_apell;
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
		return "Cajero [id=" + id + ", nom_apell=" + nom_apell + ", ventas=" + ventas + "]";
	}

}
