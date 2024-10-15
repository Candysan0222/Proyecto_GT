document.addEventListener('DOMContentLoaded', function() {
    const toggleBtn = document.querySelector('.toggle-btn');
    const sidebar = document.querySelector('.sidebar');
    const content = document.querySelector('.content');

    // Abrir y cerrar el sidebar
    toggleBtn.addEventListener('click', () => {
        sidebar.classList.toggle('open');
        content.classList.toggle('shift');
    });

    // Función para alternar submenús
    const toggleSubMenu = (event, submenuId) => {
        event.preventDefault();
        const submenu = document.getElementById(submenuId);
        const isOpen = submenu.style.display === 'block';
        submenu.style.display = isOpen ? 'none' : 'block';
        localStorage.setItem(submenuId, !isOpen);
    };

    // Inicializar el estado de los submenús
    const enlacesMenu = document.querySelectorAll('.nav-link');

    enlacesMenu.forEach(enlace => {
        const submenuId = enlace.nextElementSibling ? enlace.nextElementSibling.id : null;

        if (submenuId) {
            // Recuperar el estado del submenú
            const isOpen = localStorage.getItem(submenuId) === 'true';
            const submenu = document.getElementById(submenuId);
            submenu.style.display = isOpen ? 'block' : 'none';

            enlace.addEventListener('click', (event) => {
                toggleSubMenu(event, submenuId);
            });
        }
    });

    // Recuperar y mostrar el submenu activo al cargar
    const activeSubMenuId = localStorage.getItem('activeSubMenu');
    if (activeSubMenuId) {
        const activeSubMenu = document.getElementById(activeSubMenuId);
        if (activeSubMenu) {
            activeSubMenu.style.display = 'block';
        }
    }

    // Manejar el clic en los enlaces del menú
    enlacesMenu.forEach(link => {
        link.addEventListener('click', function() {
            // Eliminar la clase 'active' de todos los enlaces
            enlacesMenu.forEach(item => item.classList.remove('active'));
            this.classList.add('active');

            // Guardar el ID del submenu activo
            const submenuId = this.nextElementSibling ? this.nextElementSibling.id : null;
            if (submenuId) {
                localStorage.setItem('activeSubMenu', submenuId);
            }
        });
    });
});
