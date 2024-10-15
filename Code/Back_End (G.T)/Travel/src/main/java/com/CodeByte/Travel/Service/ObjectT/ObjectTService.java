package com.CodeByte.Travel.Service.ObjectT;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CodeByte.Travel.DTO.IUserDTO;
import com.CodeByte.Travel.IRepository.ObectT.IObjectTRepository;
import com.CodeByte.Travel.IRepository.Security.IPersonRepository;
import com.CodeByte.Travel.IService.ObectT.IObjectTService;
import com.CodeByte.Travel.Utils.GlobalConstants;

@Service
public abstract class ObjectTService<T> implements IObjectTService<T> {
	
    @Autowired
    public IPersonRepository loginRepository;

    @Autowired 
    private IObjectTRepository<T> repository;

    @Override
    public List<T> all() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public T save(T objeto) {
        return repository.save(objeto);
    }
    
    @Override
	public Optional<IUserDTO> userDTO(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

    @Override
    public void update(Long id, T objeto) throws Exception {
        Optional<T> optionalObjeto = this.repository.findById(id);

        if (optionalObjeto.isEmpty()) {
            throw new NoSuchElementException("No se encontró registro");
        }

        T objetoToUpdate = optionalObjeto.get();
        BeanUtils.copyProperties(objeto, objetoToUpdate, GlobalConstants.EXCLUDED_FIELDS.toArray(new String[0]));

        this.repository.save(objetoToUpdate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<T> findByStatusTrue() {
        return repository.findByStatusTrue();
    }
}