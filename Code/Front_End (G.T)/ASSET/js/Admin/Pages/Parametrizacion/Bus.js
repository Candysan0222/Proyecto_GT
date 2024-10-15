$(document).ready(function() {
    $('#agregarBusesBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#busesForm')[0].reset(); // Limpia el formulario
        $('#modalBuses').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarBusesBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#busesForm')[0].reset(); // Limpia el formulario
            $('#modalBuses').modal('show'); // Muestra el modal
        });
    });
}
