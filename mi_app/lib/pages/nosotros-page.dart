import 'package:flutter/material.dart';

class NosotrosPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Golden Travel',
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 24,
          ),
        ),
        centerTitle: false,
        backgroundColor: const Color.fromARGB(
                        255, 255, 152, 0),
      ),
      body: SingleChildScrollView(
        child: Column(
          children: [
            // Sección "Nosotros"
            Padding(
              padding: const EdgeInsets.all(20.0),
              child: Column(
                children: [
                  Text(
                    'Nosotros',
                    style: TextStyle(
                      fontSize: 28,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  SizedBox(height: 20),
                  Text(
                    'Nuestra página web se enfoca en ofrecer un servicio de alta calidad a nuestros usuarios, considerando sus opiniones y calificaciones para asegurar una experiencia excelente. '
                    'Nos gustaría conocer tu opinión sobre tus experiencias con nosotros y recibir sugerencias sobre áreas de mejora para brindarte un mejor servicio.',
                    textAlign: TextAlign.center,
                    style: TextStyle(fontSize: 16),
                  ),
                ],
              ),
            ),
            SizedBox(height: 20),

            // Sección "Encuéntranos en Redes Sociales"
            Padding(
              padding: const EdgeInsets.all(20.0),
              child: Column(
                children: [
                  Text(
                    '¡Encuéntranos en Redes Sociales!',
                    style: TextStyle(
                      fontSize: 22,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  SizedBox(height: 20),

                  // Botones de redes sociales

                  // WhatsApp con imagen
                  SocialMediaButtonWithImage(
                    imagePath: 'assets/images/wimage.jpg', // Ruta de la imagen de WhatsApp
                    label: 'Whatsapp',
                    color: Colors.green,
                    onPressed: () {
                      // Acción del botón
                    },
                  ),
                  SizedBox(height: 10),

                  // Facebook con icono predeterminado
                  SocialMediaButton(
                    icon: Icons.facebook,
                    label: 'Facebook',
                    color: Colors.blue,
                    onPressed: () {
                      // Acción del botón
                    },
                  ),
                  SizedBox(height: 10),

                  // Instagram con imagen
                  SocialMediaButtonWithImage(
                    imagePath: 'assets/images/iimage.png', // Ruta de la imagen de Instagram
                    label: 'Instagram',
                    color: Colors.pink,
                    onPressed: () {
                      // Acción del botón
                    },
                  ),
                  SizedBox(height: 10),

                  // TikTok con icono predeterminado
                  SocialMediaButtonWithImage(
                    imagePath: 'assets/images/timage.png', // Ruta de la imagen de Instagram
                    label: 'Twitter/x',
                    color: const Color.fromARGB(255, 10, 9, 9),
                    onPressed: () {
                      // Acción del botón
                    },
                  ),
                ],
              ),
            ),

            // Footer
            Padding(
              padding: const EdgeInsets.all(20.0),
              child: Column(
                children: [
                  Text(
                    'Ponte en contacto',
                    style: TextStyle(
                      fontSize: 16,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  SizedBox(height: 10),
                  Text('Email: support@goldentravel.com'),
                  Text('Teléfono: +123 456 7890'),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

// Widget reutilizable para botones de redes sociales con íconos
class SocialMediaButton extends StatelessWidget {
  final IconData icon;
  final String label;
  final Color color;
  final VoidCallback onPressed;

  const SocialMediaButton({
    required this.icon,
    required this.label,
    required this.color,
    required this.onPressed,
  });

  @override
  Widget build(BuildContext context) {
    return ElevatedButton.icon(
      onPressed: onPressed,
      icon: Icon(icon, color: Colors.white),
      label: Text(label, style: TextStyle(color: Colors.white)),
      style: ElevatedButton.styleFrom(
        backgroundColor: color,
        minimumSize: Size(double.infinity, 50),
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(10),
        ),
      ),
    );
  }
}

// Widget reutilizable para botones de redes sociales con imágenes
class SocialMediaButtonWithImage extends StatelessWidget {
  final String imagePath;
  final String label;
  final Color color;
  final VoidCallback onPressed;

  const SocialMediaButtonWithImage({
    required this.imagePath,
    required this.label,
    required this.color,
    required this.onPressed,
  });

  @override
  Widget build(BuildContext context) {
    return ElevatedButton(
      onPressed: onPressed,
      style: ElevatedButton.styleFrom(
        backgroundColor: color,
        minimumSize: Size(double.infinity, 50),
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(10),
        ),
      ),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          // Imagen
          Image.asset(
            imagePath,
            height: 24, // Tamaño de la imagen
            width: 24, // Tamaño de la imagen
            fit: BoxFit.contain,
          ),
          SizedBox(width: 10),

          // Texto
          Text(
            label,
            style: TextStyle(color: Colors.white),
          ),
        ],
      ),
    );
  }
}
