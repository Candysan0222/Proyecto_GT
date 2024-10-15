$(document).ready(function() {
    $('#agregarVistasBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#vistasForm')[0].reset(); // Limpia el formulario
        $('#modalVistas').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarVistasBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#vistasForm')[0].reset(); // Limpia el formulario
            $('#modalVistas').modal('show'); // Muestra el modal
        });
    });
}
