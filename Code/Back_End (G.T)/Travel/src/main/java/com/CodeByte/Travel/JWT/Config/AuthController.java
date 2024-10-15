package com.CodeByte.Travel.JWT.Config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CodeByte.Travel.Entity.Security.User;
import com.CodeByte.Travel.IRepository.Security.IUserRepository;
import com.CodeByte.Travel.JWT.Service.JwtService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        // Verificar si el nombre de usuario ya existe
        if (userRepository.findByUserName(user.getUserName()).isPresent()) {
            return ResponseEntity.badRequest().body("Username already exists");
        }
        // Guardar el nuevo usuario
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // Buscar el usuario por nombre de usuario
        Optional<User> foundUserOptional = userRepository.findByUserName(user.getUserName());

        // Verificar si el usuario existe y la contraseña es correcta
        if (foundUserOptional.isPresent() && 
            foundUserOptional.get().getContrasenia().equals(user.getContrasenia())) {
            // Generar el token JWT
            String token = jwtService.generateToken(foundUserOptional.get().getUserName());
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.badRequest().body("Invalid credentials");
    }
}
