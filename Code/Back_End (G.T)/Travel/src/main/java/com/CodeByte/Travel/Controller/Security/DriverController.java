package com.CodeByte.Travel.Controller.Security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Security.Driver;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/Parametrizacion/conductor")
public class DriverController extends ObjectTController<Driver>{

}
