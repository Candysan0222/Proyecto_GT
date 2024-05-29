package com.ProyectoGT.proyectoGT.Entity.Parametrizacion;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "buses_asientos")
public class BusesAsientos extends CamposAuditoria{
	
	@ManyToOne
	@JoinColumn(name="asiento_id", nullable = false, unique=true)
	private Asientos asientoId;
	
	@ManyToOne
	@JoinColumn(name="bus_id", nullable = false, unique=true)
	private Buses busId;

	public Asientos getAsientoId() {
		return asientoId;
	}

	public void setAsientoId(Asientos asientoId) {
		this.asientoId = asientoId;
	}

	public Buses getBusId() {
		return busId;
	}

	public void setBusId(Buses busId) {
		this.busId = busId;
	}
	

}
