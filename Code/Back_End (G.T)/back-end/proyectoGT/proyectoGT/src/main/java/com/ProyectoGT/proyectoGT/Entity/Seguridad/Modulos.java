package com.ProyectoGT.proyectoGT.Entity.Seguridad;


import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="modules")
public class Modulos extends CamposAuditoria{
	
	@Column (name = "code", nullable = false, unique = true, length = 10)
	private String code;
	
	@Column(name = "icon", length = 150, unique = true)
	private String icon;
	
	@Column(name = "route", length = 150, unique = true)
	private String route;
	
	@Column (name = "description", nullable = false, length = 50, unique = true)
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
	
	
}
