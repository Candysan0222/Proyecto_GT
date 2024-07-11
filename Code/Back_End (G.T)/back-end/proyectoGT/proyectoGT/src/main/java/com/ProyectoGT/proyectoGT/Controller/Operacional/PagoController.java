package com.ProyectoGT.proyectoGT.Controller.Operacional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoGT.proyectoGT.Controller.ObjetoT.ObjetoTController;
import com.ProyectoGT.proyectoGT.Entity.Operacional.Pago;

@RequestMapping ("/api/v1/proyectoGT/Operacional/Pago")
@RestController
@CrossOrigin
public class PagoController extends ObjetoTController<Pago>{

}
