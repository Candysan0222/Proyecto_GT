$(document).ready(function() {
    $('#agregarBusesAsientosBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#busesAsientosForm')[0].reset(); // Limpia el formulario
        $('#modalBusesAsientos').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarBusesAsientosBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#busesAsientosForm')[0].reset(); // Limpia el formulario
            $('#modalBusesAsientos').modal('show'); // Muestra el modal
        });
    });
}
