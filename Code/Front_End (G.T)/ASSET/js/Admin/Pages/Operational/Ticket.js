$(document).ready(function() {
    // Inicializa el evento para el botón de agregar al cargar la página
    setupAgregarTicketButton();

    // Función para cargar contenido dinámico (si es necesario)
    function loadContent(page) {
        $('#content').load(page, function() {
            // Reconfigura el botón de agregar después de cargar el contenido
            setupAgregarTicketButton();
        });
    }

    // Configura el evento del botón "Agregar"
    function setupAgregarTicketButton() {
        $('#agregarTicketBtn').off('click').on('click', function() {
            console.log('Botón Agregar clicado'); // Para verificar si se ejecuta
            $('#ticketForm')[0].reset(); // Limpia el formulario
            $('#modalTicket').modal('show'); // Muestra el modal
        });
    }

    // Si necesitas cargar contenido al inicio, descomenta la siguiente línea
    // loadContent('ruta/del/contenido.html');
});
