package com.ProyectoGT.proyectoGT.Controller.Parametrizacion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Parametrizacion.Buses;

@RequestMapping ("/api/v1/proyectoGT/Parametrizacion/Buses")
@RestController
@CrossOrigin
public class BusesContoller extends ObjetoTController<Buses>{

}
