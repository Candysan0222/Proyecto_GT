package com.CodeByte.Travel.Controller.Operational;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Operational.Sales;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/proyectoGT/Operacional/Ventajas")
public class SalesController extends ObjectTController<Sales>{

}
