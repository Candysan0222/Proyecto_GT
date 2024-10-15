$(document).ready(function() {
    $('#agregarAmigosBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#amigosForm')[0].reset(); // Limpia el formulario
        $('#modalAmigos').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarAmigosBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#amigosForm')[0].reset(); // Limpia el formulario
            $('#modalAmigos').modal('show'); // Muestra el modal
        });
    });
}
