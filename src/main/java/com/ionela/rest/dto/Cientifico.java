package com.ionela.rest.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientificos")
public class Cientifico {

	@Id
	private String dni;
	@Column
	private String nom_apell;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientifico")
	private List<AsignadoA> asignados;

	public Cientifico(String dni, String nom_apell, List<AsignadoA> asignados) {
		this.dni = dni;
		this.nom_apell = nom_apell;
		this.asignados = asignados;
	}

	public Cientifico() {
	}

	public String getDni() {
		return dni;
	}

	public String getNom_apell() {
		return nom_apell;
	}

	public void setNom_apell(String nom_apell) {
		this.nom_apell = nom_apell;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public List<AsignadoA> getAsignados() {
		return asignados;
	}

	public void setAsignados(List<AsignadoA> asignados) {
		this.asignados = asignados;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nom_apell=" + nom_apell + ", asignados=" + asignados + "]";
	}

}
