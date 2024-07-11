package com.ProyectoGT.proyectoGT.Service.ObjetoT;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoGT.proyectoGT.IRepository.ObjetoT.IObjetoTRepository;
import com.ProyectoGT.proyectoGT.IService.ObjetoT.IObjetoTService;
import com.ProyectoGT.proyectoGT.Utils.GlobalConstants;

@Service
public abstract class ObjetoTService<T> implements IObjetoTService<T>{
	
	@Autowired 
	private IObjetoTRepository<T> repository;

	@Override
	public List<T> all() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<T> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public T save(T objeto) {
		// TODO Auto-generated method stub
		return repository.save(objeto);
	}

	@Override
	public void update(Long id, T objeto) throws Exception {
		// TODO Auto-generated method stub
		Optional<T> optionalObjeto = this.repository.findById(id);

        if (optionalObjeto.isEmpty()) {
            throw new Exception("No se encontró registro");
        }

        T objetoToUpdate = optionalObjeto.get();
        BeanUtils.copyProperties(objeto, objetoToUpdate, GlobalConstants.EXCLUDED_FIELDS.toArray(new String[0]));

        this.repository.save(objetoToUpdate);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<T> findByEstadoTrue() {
		// TODO Auto-generated method stub
		return repository.findByEstadoTrue();
	}
	
}
