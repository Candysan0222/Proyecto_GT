import 'package:flutter/material.dart';
import 'package:mi_app/pages/TicketDetail-page.dart';
import 'package:mi_app/pages/inicio-page.dart';
import 'package:mi_app/pages/nosotros-page.dart';
import 'package:mi_app/pages/ofertas-page.dart';
import 'package:mi_app/pages/viajes-page.dart';
import 'package:mi_app/pages/welcomeLogin.dart';

class DashboardPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Golden Travel'),
      ),
      drawer: Drawer(
        child: ListView(
          padding: EdgeInsets.zero,
          children: <Widget>[
            DrawerHeader(
              decoration: BoxDecoration(
                color: Color.fromARGB(255, 236, 145, 8),
              ),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Image.asset(
                    'assets/images/imagologoblack.png', // Coloca tu logo aquí
                    width: 200,
                    height: 100,
                  ),
                  SizedBox(height: 10),
                  Text(
                    'Dashboard',
                    style: TextStyle(
                      color: Colors.black,
                      fontSize: 20,
                    ),
                  ),
                ],
              ),
            ),
            // Menú de navegación
            ListTile(
              leading: Icon(Icons.home),
              title: Text('Inicio'),
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => InicioPage()),
                );
              },
            ),
            ListTile(
              leading: Icon(Icons.info),
              title: Text('Nosotros'),
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => NosotrosPage()),
                );
              },
            ),
            ListTile(
              leading: Icon(Icons.map),
              title: Text('Viajes'),
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => ViajesPage()),
                );
              },
            ),
            ListTile(
              leading: Icon(Icons.local_offer),
              title: Text('Ofertas'),
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => OfertasPage()),
                );
              },
            ),
            ListTile(
              leading: Icon(Icons.login),
              title: Text('Ingresar'),
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => welcomeLogin()),
                );
              },
            ),
          ],
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Título
            Text(
              'Tus tickets',
              style: TextStyle(fontSize: 26, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 20),
            // Tarjeta del ticket
            _buildTicketCard(context, 'Cueva del Tigre', '12345'),
            SizedBox(height: 20),
            // Botón para agregar un nuevo viaje
            ElevatedButton.icon(
              onPressed: () {
                // Lógica para añadir un nuevo viaje
              },
              icon: Icon(Icons.add, color: Colors.black),
              label: Text('Agregar nuevo viaje', style: TextStyle(color: Colors.black)),
              style: ElevatedButton.styleFrom(
                backgroundColor: Color.fromARGB(255, 243, 159, 33),
              ),
            ),
          ],
        ),
      ),
    );
  }

  // Widget que crea la tarjeta del ticket
  Widget _buildTicketCard(BuildContext context, String destino, String numeroTicket) {
    return Card(
      elevation: 5,
      child: ListTile(
        leading: Icon(Icons.directions_bus_filled_outlined, size: 40, color: Color.fromARGB(255, 243, 159, 33)),
        title: Text('Ticket válido para $destino'),
        subtitle: Text('Número del ticket: $numeroTicket'),
        trailing: Icon(Icons.arrow_forward),
        onTap: () {
          // Navegar a la página de detalles del ticket
          Navigator.push(
            context,
            MaterialPageRoute(
              builder: (context) => TicketDetailPage(destino: destino, numeroTicket: numeroTicket),
            ),
          );
        },
      ),
    );
  }
}
