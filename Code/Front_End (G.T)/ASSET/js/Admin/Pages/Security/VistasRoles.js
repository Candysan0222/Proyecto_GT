$(document).ready(function() {
    $('#agregarVistasRolesBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#vistasRolesForm')[0].reset(); // Limpia el formulario
        $('#modalVistasRoles').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarVistasRolesBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#vistasRolesForm')[0].reset(); // Limpia el formulario
            $('#modalVistasRoles').modal('show'); // Muestra el modal
        });
    });
}
