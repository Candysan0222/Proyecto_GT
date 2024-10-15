$(document).ready(function() {
    $('#agregarMetodo_de_pagoBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#metodo_de_pagoForm')[0].reset(); // Limpia el formulario
        $('#modalMetodo_de_pago').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarMetodo_de_pagoBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#metodo_de_pagoForm')[0].reset(); // Limpia el formulario
            $('#modalMetodo_de_pago').modal('show'); // Muestra el modal
        });
    });
}
