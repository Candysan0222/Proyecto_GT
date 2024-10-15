const listItems = document.querySelectorAll(".sidebar-list li");

listItems.forEach((item) => {
    item.addEventListener("click", () => {
        let isActive = item.classList.contains("active");

        listItems.forEach((el) => {
            el.classList.remove("active");
        });

        if (isActive) item.classList.remove("active");
        else item.classList.add("active");
    });
});

const toggleSidebar = document.querySelector(".toggle-sidebar");
const logo = document.querySelector(".logo-box");
const sidebar = document.querySelector(".sidebar");

toggleSidebar.addEventListener("click", () => {
    sidebar.classList.toggle("close");
});

logo.addEventListener("click", () => {
    sidebar.classList.toggle("close");
});

// Manejo de eventos para el submenu
const dropdowns = document.querySelectorAll(".dropdown");

dropdowns.forEach((dropdown) => {
    const submenuLinks = dropdown.querySelectorAll(".submenu .link");

    submenuLinks.forEach((link) => {
        link.addEventListener("click", (event) => {
            event.preventDefault(); // Evita el comportamiento por defecto del enlace
            const url = link.getAttribute("onclick").match(/'(.*?)'/)[1]; // Extrae la URL de onclick
            loadContent(url); // Llama a la función para cargar el contenido
        });
    });
});

// Función para cargar contenido en el área designada
function loadContent(url) {
    const contentArea = document.getElementById("content");

    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.text();
        })
        .then(data => {
            contentArea.innerHTML = data; // Carga el contenido
            initializePage(); // Inicializa cualquier funcionalidad en la nueva vista
        })
        .catch(error => console.error('Error loading content:', error));
}

function initializePage() {
    // Inicializa elementos específicos
    $('#agregarPagoBtn').on('click', function() {
        console.log('Botón Agregar clicado');
        $('#pagoForm')[0].reset(); // Limpia el formulario
        $('#modalPago').modal('show'); // Muestra el modal
    });

    // Inicializa DataTables o cualquier otro script específico
}

