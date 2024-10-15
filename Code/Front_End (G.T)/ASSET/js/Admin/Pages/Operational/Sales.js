$(document).ready(function() {
    $('#agregarVentasBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#ventasForm')[0].reset(); // Limpia el formulario
        $('#modalVentas').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarVentasBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#ventasForm')[0].reset(); // Limpia el formulario
            $('#modalVentas').modal('show'); // Muestra el modal
        });
    });
}
