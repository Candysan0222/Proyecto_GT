package com.ProyectoGT.proyectoGT.IRepository.ObjetoT;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IObjetoTRepository<T> extends JpaRepository<T, Long>{

	List<T> findByEstadoTrue();
	
}
