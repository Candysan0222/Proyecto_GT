package com.ProyectoGT.proyectoGT.Controller.Seguridad;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Seguridad.Personas;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/api/v1/proyectoGT/Seguridad/Personas")
public class PersonasController extends ObjetoTController<Personas>{

}
