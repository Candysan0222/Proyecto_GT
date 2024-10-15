package com.CodeByte.Travel.Controller.Security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Security.PaymentMethod;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping ("/Seguridad/Metodo de pago")
public class PaymentMethodController extends ObjectTController<PaymentMethod>{

}
