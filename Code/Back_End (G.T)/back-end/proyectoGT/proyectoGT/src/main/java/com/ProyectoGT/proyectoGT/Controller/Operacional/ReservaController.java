package com.ProyectoGT.proyectoGT.Controller.Operacional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Operacional.Reserva;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/api/v1/proyectoGT/Operacional/Reserva")
public class ReservaController extends ObjetoTController<Reserva>{

}
