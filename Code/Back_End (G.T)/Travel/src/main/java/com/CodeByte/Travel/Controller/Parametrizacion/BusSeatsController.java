package com.CodeByte.Travel.Controller.Parametrizacion;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Parametrizacion.BusSeats;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("Parametrizacion/Buses Asientos")
public class BusSeatsController extends ObjectTController<BusSeats>{

}
