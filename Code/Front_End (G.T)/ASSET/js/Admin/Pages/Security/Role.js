$(document).ready(function() {
    $('#agregarRolesBtn').on('click', function() {
        console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
        $('#rolesForm')[0].reset(); // Limpia el formulario
        $('#modalRoles').modal('show'); // Muestra el modal
    });
});
function loadContent(page) {
    $('#content').load(page, function() {
        // Asegúrate de que el código que abre el modal se ejecute después de cargar el contenido
        $('#agregarRolesBtn').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#rolesForm')[0].reset(); // Limpia el formulario
            $('#modalRoles').modal('show'); // Muestra el modal
        });
    });
}
