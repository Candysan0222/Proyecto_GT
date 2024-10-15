$(document).ready(function() {
    // Este evento se configura cuando se carga el contenido inicial
    $('#agregarReservaAsientosBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#reservaAsientosForm')[0].reset(); // Limpia el formulario
        $('#modalReservaAsientos').modal('show'); // Muestra el modal
    });
});

function loadContent(page) {
    $('#content').load(page, function() {
        // Este evento se configura después de que se carga el nuevo contenido
        $('#agregarReservaAsientosBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#reservaAsientosForm')[0].reset(); // Limpia el formulario
            $('#modalReservaAsientos').modal('show'); // Muestra el modal
        });
    });
}
