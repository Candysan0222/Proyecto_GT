package com.ProyectoGT.proyectoGT.Entity.Operacional;
import com.ProyectoGT.proyectoGT.Entity.CamposAuditoria;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket extends CamposAuditoria{
	
	@ManyToOne
	@JoinColumn(name="reserva_id", nullable = false, unique=true)
	private Reserva reservaId;
	
	@ManyToOne
	@JoinColumn(name="paquete_id", nullable = false, unique=true)
	private Paquetes paqueteId;

	public Reserva getReservaId() {
		return reservaId;
	}

	public void setReservaId(Reserva reservaId) {
		this.reservaId = reservaId;
	}

	public Paquetes getPaqueteId() {
		return paqueteId;
	}

	public void setPaqueteId(Paquetes paqueteId) {
		this.paqueteId = paqueteId;
	}
	

}
