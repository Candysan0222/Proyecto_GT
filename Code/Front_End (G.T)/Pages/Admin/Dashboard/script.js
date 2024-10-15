document.addEventListener('DOMContentLoaded', function() {
    const menuItems = document.querySelectorAll('.menu-item');

    menuItems.forEach(item => {
        item.addEventListener('click', function(e) {
            const submenu = this.nextElementSibling;
            const arrow = this.querySelector('.arrow');

            if (submenu) {
                e.preventDefault(); // Evitar que el enlace principal se siga
                const isOpen = submenu.style.display === 'block';

                // Alternar la visibilidad del submenú
                submenu.style.display = isOpen ? 'none' : 'block';

                // Animación de la flecha
                arrow.style.transform = isOpen ? 'rotate(0deg)' : 'rotate(180deg)';
            }
        });
    });

    const submenuItems = document.querySelectorAll('.submenu-item');

    submenuItems.forEach(item => {
        item.addEventListener('click', function(e) {
            e.preventDefault();
            const contentId = this.getAttribute('data-content');
            loadContent(contentId);
        });
    });

    function loadContent(contentId) {
        const contentArea = document.getElementById('content');

        if (contentId === 'dashboard') {
            contentArea.innerHTML = `
                <h1>Dashboard Operacional</h1>
                <p>Contenido del dashboard aquí...</p>
            `;
        } else {
            contentArea.innerHTML = `<h1>Bienvenido</h1><p>Seleccione una opción del menú.</p>`;
        }
    }
});
