import 'package:flutter/material.dart';

class ViajesPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Viajes'),
      ),
      body: Center(
        child: Text(
          'Esta es la página de Viajes.',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}
