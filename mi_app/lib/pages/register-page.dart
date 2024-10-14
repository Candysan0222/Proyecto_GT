import 'package:flutter/material.dart';
import 'package:flutter_signin_button/flutter_signin_button.dart';

class RegisterPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          // Imagen de fondo con las ondulaciones
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage('assets/images/fondo.png'), // Imagen de fondo
                fit: BoxFit.cover,
              ),
            ),
          ),
          SingleChildScrollView(
            // Envolver el contenido en SingleChildScrollView
            child: Padding(
              padding:
                  const EdgeInsets.symmetric(horizontal: 20.0, vertical: 50.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  // Logo encima del título de Registro
                  Container(
                    margin: EdgeInsets.only(
                        bottom: 20), // Espacio entre logo y texto "REGISTER"
                    child: Image.asset(
                      'assets/images/logo.png', // Ruta de tu logo
                      height: 250,
                    ),
                  ),
                  // Título de Registro
                  Text(
                    'Registro',
                    style: TextStyle(
                      fontSize: 32,
                      fontWeight: FontWeight.w400,
                      color: Color.fromARGB(255, 0, 0, 0),
                    ),
                  ),
                  SizedBox(height: 30),
                  // Username field
                  TextField(
                    decoration: InputDecoration(
                      labelText: 'Nombre de usuario',
                      filled: true,
                      fillColor: Colors.white.withOpacity(0.8),
                      border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(10),
                      ),
                    ),
                  ),
                  SizedBox(height: 20),
                  // Email field
                  TextField(
                    decoration: InputDecoration(
                      labelText: 'Correo electrónico',
                      filled: true,
                      fillColor: Colors.white.withOpacity(0.8),
                      border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(10),
                      ),
                    ),
                  ),
                  SizedBox(height: 20),
                  // Password field
                  TextField(
                    obscureText: true,
                    decoration: InputDecoration(
                      labelText: 'Contraseña',
                      filled: true,
                      fillColor: Colors.white.withOpacity(0.8),
                      border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(10),
                      ),
                    ),
                  ),
                  SizedBox(height: 20),
                  // Botón de Registro
                  ElevatedButton(
                    onPressed: () {
                      // Acción del botón de registro
                    },
                    style: ElevatedButton.styleFrom(
                      backgroundColor: Color.fromARGB(
                          255, 255, 152, 0), // Color de fondo del botón
                      shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(10),
                      ),
                      minimumSize: Size(double.infinity, 50), // Ancho completo
                    ),
                    child: Text(
                      'Registrarse',
                      style: TextStyle(
                        fontSize: 18,
                        color: Colors.black, // Color del texto
                      ),
                    ),
                  ),
                  SizedBox(height: 20),
                  // Enlace a registro
                  TextButton(
                    onPressed: () {
                      Navigator.pushNamed(
                          context, '/login'); // Redirige al LoginPage
                    },
                    child: Text(
                      "Ya tienes una cuenta? Inicia sesión",
                      style:
                          TextStyle(color: const Color.fromARGB(255, 4, 50, 88)),
                    ),
                  ),

                  SizedBox(height: 10),

                  // Register with Facebook and Google
                  SignInButton(
                    Buttons.Facebook,
                    onPressed: () {
                      // Acción para login con Facebook
                    },
                  ),
                  SizedBox(height: 10),
                  SignInButton(
                    Buttons.Google,
                    onPressed: () {
                      // Acción para login con Google
                    },
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}
