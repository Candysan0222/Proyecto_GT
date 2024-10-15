$(document).ready(function() {
    $('#agregarPerosnasBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#perosnasForm')[0].reset(); // Limpia el formulario
        $('#modalPerosnas').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarPerosnasBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#perosnasForm')[0].reset(); // Limpia el formulario
            $('#modalPerosnas').modal('show'); // Muestra el modal
        });
    });
}
