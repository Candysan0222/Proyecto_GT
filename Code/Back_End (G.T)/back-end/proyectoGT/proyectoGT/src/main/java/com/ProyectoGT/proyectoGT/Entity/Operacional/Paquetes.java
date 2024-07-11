package com.ProyectoGT.proyectoGT.Entity.Operacional;

import java.time.LocalDateTime;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;
import com.ProyectoGT.proyectoGT.Entity.Parametrizacion.SitiosTuristicos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="paquetes")
public class Paquetes extends CamposAuditoria{
	
	@Column(name = "precio",nullable = false)
	private double precio;
	
	@Column(name = "descripcion",nullable = false, length = 150)
	private String descripcion;
	
	@Column(name = "fecha_salida",nullable = false)
	private LocalDateTime fechaSalida;
	
	@Column(name = "fecha_regreso",nullable = false)
	private LocalDateTime fechaRegreso;
	
	@Column(name = "lugar_salida",nullable = false, length = 50)
	private String lugarSalida;
	
	@Column(name = "numero_dissponibilidad",nullable = false)
	private int numeroDisponibilidad;
	
	@ManyToOne
	@JoinColumn(name="sitios_turisticos_id", nullable = false, unique=true)
	private SitiosTuristicos sitiosTuristicosId;
	
	@ManyToOne
	@JoinColumn(name="bus_id", nullable = false, unique=true)
	private SitiosTuristicos busId;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDateTime fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public LocalDateTime getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(LocalDateTime fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public String getLugarSalida() {
		return lugarSalida;
	}

	public void setLugarSalida(String lugarSalida) {
		this.lugarSalida = lugarSalida;
	}

	public int getNumeroDisponibilidad() {
		return numeroDisponibilidad;
	}

	public void setNumeroDisponibilidad(int numeroDisponibilidad) {
		this.numeroDisponibilidad = numeroDisponibilidad;
	}

	public SitiosTuristicos getSitiosTuristicosId() {
		return sitiosTuristicosId;
	}

	public void setSitiosTuristicosId(SitiosTuristicos sitiosTuristicosId) {
		this.sitiosTuristicosId = sitiosTuristicosId;
	}

	public SitiosTuristicos getBusId() {
		return busId;
	}

	public void setBusId(SitiosTuristicos busId) {
		this.busId = busId;
	}

}
