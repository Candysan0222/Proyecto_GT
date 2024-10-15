$(document).ready(function() {
    $('#agregarPagoBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#pagoForm')[0].reset(); // Limpia el formulario
        $('#modalPago').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarPagoBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#pagoForm')[0].reset(); // Limpia el formulario
            $('#modalPago').modal('show'); // Muestra el modal
        });
    });
}
