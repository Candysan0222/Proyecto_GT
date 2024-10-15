$(document).ready(function() {
    // Inicializa el evento para el botón de agregar al cargar la página
    setupAgregarPaquetesButton();

    // Función para cargar contenido dinámico
    function loadContent(page) {
        $('#content').load(page, function() {
            // Reconfigura el botón de agregar después de cargar el contenido
            setupAgregarPaquetesButton();
        });
    }

    function setupAgregarPaquetesButton() {
        $('#agregarPaquetesBtn').off('click').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#paquetesForm')[0].reset(); // Limpia el formulario
            $('#modalPaquetes').modal('show'); // Muestra el modal
        });
    }

    // Llama a la función loadContent cuando sea necesario
    // Por ejemplo, al hacer clic en un enlace o botón
    // loadContent('ruta/del/contenido.html');
});
