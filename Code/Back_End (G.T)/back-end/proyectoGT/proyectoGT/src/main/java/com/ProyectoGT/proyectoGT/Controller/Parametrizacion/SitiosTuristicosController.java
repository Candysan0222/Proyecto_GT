package com.ProyectoGT.proyectoGT.Controller.Parametrizacion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Parametrizacion.SitiosTuristicos;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/api/v1/proyectoGT/Parametrizacion/SitiosTuristicos")
public class SitiosTuristicosController extends ObjetoTController<SitiosTuristicos>{

}
