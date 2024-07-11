package com.ProyectoGT.proyectoGT.Entity.Seguridad;

import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuarios extends CamposAuditoria{
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "contrasenia", nullable = false, length = 50)
	private String contrasenia;
	
	@Column(name="foto", columnDefinition="TEXT")
	private String foto;
	
	@ManyToOne
	@JoinColumn(name="personas_id", nullable = false, unique=true)
	private Personas personaId;
	
	@ManyToOne
	@JoinColumn(name="roles_id", nullable = false, unique=true)
	private Roles rolesId;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Personas getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Personas personaId) {
		this.personaId = personaId;
	}

	public Roles getRolesId() {
		return rolesId;
	}

	public void setRolesId(Roles rolesId) {
		this.rolesId = rolesId;
	}

	

}
