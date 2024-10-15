package com.CodeByte.Travel.Controller.Parametrizacion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Parametrizacion.Seats;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("Parametrizacion/Asientos")
public class SeatsController extends ObjectTController<Seats>{

}
