package com.ProyectoGT.proyectoGT.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class CamposAuditoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "estado", nullable = false)
	private Boolean estado;
	
	@Column(name = "fecha_creo", nullable = false)
	private LocalDateTime fechaCreo;
	
	@Column(name = "fecha_modifico", nullable = false)
	private LocalDateTime fechaModifico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public LocalDateTime getFechaCreo() {
		return fechaCreo;
	}

	public void setFechaCreo(LocalDateTime fechaCreo) {
		this.fechaCreo = fechaCreo;
	}

	public LocalDateTime getFechaModifico() {
		return fechaModifico;
	}

	public void setFechaModifico(LocalDateTime fechaModifico) {
		this.fechaModifico = fechaModifico;
	}
	
}
