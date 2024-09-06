package com.ProyectoGT.proyectoGT.IRepository.Seguridad;

import java.util.Optional;

import com.ProyectoGT.proyectoGT.Entity.Seguridad.Usuarios;
import com.ProyectoGT.proyectoGT.IRepository.ObjetoT.IObjetoTRepository;

public interface IUsuariosRepository extends IObjetoTRepository<Usuarios>{
	Optional<Usuarios> findByUsername(String username);
}
