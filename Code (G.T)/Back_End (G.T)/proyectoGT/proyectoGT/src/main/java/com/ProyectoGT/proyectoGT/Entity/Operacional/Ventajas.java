package com.ProyectoGT.proyectoGT.Entity.Operacional;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventajas")
public class Ventajas {
	
	@Column(name = "descripcion",nullable = false, length = 150)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="paquete_id", nullable = false, unique=true)
	private Paquetes paqueteId;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Paquetes getPaqueteId() {
		return paqueteId;
	}

	public void setPaqueteId(Paquetes paqueteId) {
		this.paqueteId = paqueteId;
	}
	

}
