import 'package:flutter/material.dart';

class OfertasPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Ofertas'),
      ),
      body: Center(
        child: Text(
          'Esta es la página de Ofertas.',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}
