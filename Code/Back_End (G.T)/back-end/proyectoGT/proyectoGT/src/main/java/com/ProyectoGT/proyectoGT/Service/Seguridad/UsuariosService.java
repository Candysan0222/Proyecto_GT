package com.ProyectoGT.proyectoGT.Service.Seguridad;


import java.util.Collections; // Importación correcta de java.util.Collections

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ProyectoGT.proyectoGT.Entity.Seguridad.Usuarios;
import com.ProyectoGT.proyectoGT.IRepository.Seguridad.IUsuariosRepository;
import com.ProyectoGT.proyectoGT.IService.Seguridad.IUsuariosService;
import com.ProyectoGT.proyectoGT.Service.ObjetoT.ObjetoTService;

@Service
public class UsuariosService extends ObjetoTService<Usuarios> implements IUsuariosService, UserDetailsService{

	@Autowired
	private IUsuariosRepository repository;

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuarios usuario = repository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        // Convertimos el rol en una autoridad SimpleGrantedAuthority
        return new User(usuario.getNombre(), usuario.getContrasenia(),
                Collections.singletonList(new SimpleGrantedAuthority(usuario.getRolesId().getNombre())));
    }
	
	
	

}
