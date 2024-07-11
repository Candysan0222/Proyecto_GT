package com.ProyectoGT.proyectoGT.Controller.Operacional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Operacional.Paquetes;

@RequestMapping ("/api/v1/proyectoGT/Operacional/Paquetes")
@RestController
@CrossOrigin
public class PaquetesController extends ObjetoTController<Paquetes>{

}
