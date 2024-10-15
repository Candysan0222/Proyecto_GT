$(document).ready(function() {
    $('#agregarReservaBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#reservaForm')[0].reset(); // Limpia el formulario
        $('#modalReserva').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarReservaBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#reservaForm')[0].reset(); // Limpia el formulario
            $('#modalReserva').modal('show'); // Muestra el modal
        });
    });
}
