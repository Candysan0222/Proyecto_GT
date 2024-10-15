$(document).ready(function() {
    $('#agregarSitiosTuristicosBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#sitiosTuristicosForm')[0].reset(); // Limpia el formulario
        $('#modalSitiosTuristicos').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarSitiosTuristicosBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#sitiosTuristicosForm')[0].reset(); // Limpia el formulario
            $('#modalSitiosTuristicos').modal('show'); // Muestra el modal
        });
    });
}
