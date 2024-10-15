import 'package:flutter/material.dart';
import 'dart:async';
import 'package:flutter_signin_button/flutter_signin_button.dart';
import 'package:mi_app/pages/login-page.dart';
import 'package:mi_app/pages/register-page.dart';
import 'package:mi_app/pages/welcomeLogin.dart'; // Para usar el temporizador

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Golden Travel Login',
      theme: ThemeData(primarySwatch: Colors.blue),
      home: SplashScreen(),initialRoute: '/home',
      routes: {
        '/init': (context) => welcomeLogin(), // Pantalla inicial
        '/login': (context) => LoginPage(), // Pantalla de login
        '/register': (context) => RegisterPage(), // Pantalla de registro
      },
    );
  }
}

class SplashScreen extends StatefulWidget {
  @override
  _SplashScreenState createState() => _SplashScreenState();
}

class _SplashScreenState extends State<SplashScreen>
    with SingleTickerProviderStateMixin {
  late AnimationController _controller; // Marcamos como 'late'
  late Animation<double> _animation;

  @override
  void initState() {
    super.initState();

    // Inicializa el controlador para la animación
    _controller = AnimationController(
      vsync: this,
      duration: Duration(seconds: 4), // Duración total de la animación
    )..repeat(reverse: true);

    // Configura la animación para que haga zoom in y zoom out
    _animation = Tween<double>(begin: 0.8, end: 1.8).animate(CurvedAnimation(
      parent: _controller,
      curve: Curves.easeInOut,
    ));

    // Configura el temporizador para avanzar al login después de 3 ciclos de la animación
    Timer(Duration(seconds: 6), () {
      Navigator.of(context).pushReplacement(
        MaterialPageRoute(builder: (_) => LoginPage()),
      );
    });
  }

  @override
  void dispose() {
    _controller.dispose(); // Libera el controlador al salir de la pantalla
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          // Imagen de fondo
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage(
                    'assets/images/fondo.png'), // Cambia por la imagen de fondo
                fit: BoxFit.cover,
              ),
            ),
          ),
          // Logo con la animación
          Center(
            child: ScaleTransition(
              scale: _animation,
              child: Image.asset(
                'assets/images/logo.png', // Ruta de tu logo
                width: 200,
                height: 200,
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class LoginPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        children: [
          // Imagen de fondo con las ondulaciones
          Container(
            decoration: BoxDecoration(
              image: DecorationImage(
                image: AssetImage(
                    'assets/images/fondo.png'), // Cambia por la imagen de las ondulaciones
                fit: BoxFit.cover,
              ),
            ),
          ),
          Padding(
            padding:
                const EdgeInsets.symmetric(horizontal: 20.0, vertical: 50.0),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                // Logo encima del título de Login
                Container(
                  margin: EdgeInsets.only(
                      bottom: 20), // Espacio entre logo y texto "LOGIN"
                  child: Image.asset(
                    'assets/images/logo.png', // Ruta de tu logo
                    height: 250,
                  ),
                ),
                // Título de Login
                Text(
                  'Iniciar sesión',
                  style: TextStyle(
                    fontSize: 32,
                    fontWeight: FontWeight.w400,
                    color: Color.fromARGB(255, 0, 0, 0),
                  ),
                ),
                SizedBox(height: 30),
                // Email field
                TextField(
                  decoration: InputDecoration(
                    labelText: 'Email',
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
                    labelText: 'Password',
                    filled: true,
                    fillColor: Colors.white.withOpacity(0.8),
                    border: OutlineInputBorder(
                      borderRadius: BorderRadius.circular(10),
                    ),
                  ),
                ),
                SizedBox(height: 20),
                // Botón de Login
                ElevatedButton(
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder: (context) => DashboardPage()),
                    );
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
                    'Ingresar',
                    style: TextStyle(
                      fontSize: 18,
                      color: Colors.black, // Cambia el color del texto a negro
                    ),
                  ),
                ),
                SizedBox(height: 20),
                // Enlace a registro
                TextButton(
                  onPressed: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder: (context) => RegisterPage()),
                    );
                  },
                  child: Text(
                    "No tienes una cuenta? Regístrate",
                    style:
                        TextStyle(color: const Color.fromARGB(255, 4, 50, 88)),
                  ),
                ),
                SizedBox(height: 20),
                // Botón de Facebook y Google
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
        ],
      ),
    );
  }
}
