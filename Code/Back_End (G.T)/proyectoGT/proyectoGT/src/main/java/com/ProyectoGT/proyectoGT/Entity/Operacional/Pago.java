package com.ProyectoGT.proyectoGT.Entity.Operacional;

import java.time.LocalDateTime;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago extends CamposAuditoria{
	
	@Column(name = "fecha_pago",nullable = false)
	private LocalDateTime fechaPago;
	
	@Column(name = "codigo",nullable = false, length=50)
	private String codigo;
	
	@Column(name = "descripcion",nullable = false, length=150)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="reserva_id", nullable = false, unique=true)
	private Reserva reservaId;
	
	@ManyToOne
	@JoinColumn(name="metodo_pago_id", nullable = false, unique=true)
	private Reserva metodoPagoId;

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Reserva getReservaId() {
		return reservaId;
	}

	public void setReservaId(Reserva reservaId) {
		this.reservaId = reservaId;
	}

	public Reserva getMetodoPagoId() {
		return metodoPagoId;
	}

	public void setMetodoPagoId(Reserva metodoPagoId) {
		this.metodoPagoId = metodoPagoId;
	}
	

}
