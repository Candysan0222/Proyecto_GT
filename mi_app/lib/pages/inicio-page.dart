import 'package:flutter/material.dart';

class InicioPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Inicio'),
      ),
      body: Center(
        child: Text(
          'Holi ',
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}
