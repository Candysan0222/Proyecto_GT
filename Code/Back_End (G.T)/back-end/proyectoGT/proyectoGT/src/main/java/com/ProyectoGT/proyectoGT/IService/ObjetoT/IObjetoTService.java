package com.ProyectoGT.proyectoGT.IService.ObjetoT;

import java.util.List;
import java.util.Optional;



public interface IObjetoTService<T> {
	
	public List <T> all();
	public Optional<T> findById (Long id);
	public T save (T objeto);
	public void update (Long id, T objeto) throws Exception;
	public void delete (Long id);
	public List<T> findByEstadoTrue();
	
	
}
