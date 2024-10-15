package com.CodeByte.Travel.Controller.Operational;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Operational.TravelPackages;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("Operacional/Paquetes turisticos")
public class TravelPackagesController extends ObjectTController<TravelPackages>{

}
