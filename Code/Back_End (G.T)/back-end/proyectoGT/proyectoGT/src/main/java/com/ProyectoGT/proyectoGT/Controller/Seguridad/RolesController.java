package com.ProyectoGT.proyectoGT.Controller.Seguridad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Seguridad.Roles;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/api/v1/proyectoGT/Seguridad/Roles")
public class RolesController extends ObjetoTController<Roles>{

}
