package com.CodeByte.Travel.Controller.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CodeByte.Travel.Controller.ObjectT.ObjectTController;
import com.CodeByte.Travel.Entity.Security.User;
import com.CodeByte.Travel.Service.Security.UserService;

import java.time.LocalDateTime;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Seguridad/Usuarios")
public class UserController extends ObjectTController<User> {

    @Autowired
    private UserService service;

    @Autowired
    public UserController(UserService service) {
        super();
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public ResponseEntity<User> save(@RequestBody User user) throws Exception {
        // Establecer los campos de la clase Base
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        user.setDeletedAt(null); // Asegúrate de tener este método definido en User
        user.setStatus(true); // Por defecto, el usuario está activo

        // Llama al método save de la clase base
        ResponseEntity<User> createdUserResponse = super.save(user);
        return createdUserResponse; // Devuelve el ResponseEntity directamente
    }
}
