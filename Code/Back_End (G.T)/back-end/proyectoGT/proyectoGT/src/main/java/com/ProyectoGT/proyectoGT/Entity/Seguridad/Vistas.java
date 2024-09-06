package com.ProyectoGT.proyectoGT.Entity.Seguridad;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "views")
public class Vistas extends CamposAuditoria{

	
	@Column(name = "code", length = 150, unique = true)
	private String code;
	
	@Column(name = "route", length = 150, unique = true)
	private String route;
	
	@Column (name = "label", nullable = false, length = 100)
	private String label;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "module_id", nullable = false)
    private Modulos moduleId;

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Modulos getModuleId() {
		return moduleId;
	}

	public void setModuleId(Modulos moduleId) {
		this.moduleId = moduleId;
	}


	
	
}
