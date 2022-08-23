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
@Table(name = "proyectos")
public class Proyecto {

	@Id
	private String id;
	@Column
	private String nombre;
	@Column
	private String horas;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proyecto")
	private List<AsignadoA> asignados;

	public Proyecto() {
	}

	public Proyecto(String id, String nombre, String horas, List<AsignadoA> asignados) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignados = asignados;
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
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
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", asignados=" + asignados + "]";
	}
	
	

}
