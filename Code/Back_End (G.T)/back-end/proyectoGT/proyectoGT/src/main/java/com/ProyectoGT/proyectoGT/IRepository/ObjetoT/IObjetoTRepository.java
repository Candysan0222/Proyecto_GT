package com.ProyectoGT.proyectoGT.IRepository.ObjetoT;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IObjetoTRepository<T> extends JpaRepository<T, Long>{

	List<T> findByEstadoTrue();
	
}
