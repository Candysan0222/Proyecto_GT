package com.ProyectoGT.proyectoGT.Entity.Parametrizacion;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "sitios_turisticos")
public class SitiosTuristicos extends CamposAuditoria{
	
	@Column(name="nombre", nullable = false , length = 50)
	private String nombre;
	
	@Column(name="ubicacion", nullable = false , length = 150)
	private String ubicacion;
	
	@Column(name="descripcion", nullable = false , length = 150)
	private String descripcion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
