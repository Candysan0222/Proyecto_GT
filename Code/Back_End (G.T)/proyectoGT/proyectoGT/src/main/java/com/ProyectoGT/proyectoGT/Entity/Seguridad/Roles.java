package com.ProyectoGT.proyectoGT.Entity.Seguridad;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Roles extends CamposAuditoria{
	
	@Column(name = "nombre",nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "descripcion",nullable = false, length = 50)
	private String descripcion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
