$(document).ready(function() {
    $('#agregarModulosBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#modulosForm')[0].reset(); // Limpia el formulario
        $('#modalModulos').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarModulosBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#modulosForm')[0].reset(); // Limpia el formulario
            $('#modalModulos').modal('show'); // Muestra el modal
        });
    });
}
