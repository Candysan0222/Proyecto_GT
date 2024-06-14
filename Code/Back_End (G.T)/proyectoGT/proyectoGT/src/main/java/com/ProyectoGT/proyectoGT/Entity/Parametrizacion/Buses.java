package com.ProyectoGT.proyectoGT.Entity.Parametrizacion;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "buses")
public class Buses extends CamposAuditoria{
	
	@Column(name="placa", nullable = false , length = 10)
	private String placa;
	
	@Column(name="numero_asientos", nullable = false , length = 2)
	private int numeroAsientos;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

}
