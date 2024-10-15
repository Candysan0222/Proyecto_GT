// Simulando datos de movimientos de usuarios administradores
const userActivities = [
    { user: 'Admin 1', action: 'inició sesión', timestamp: new Date().toLocaleString() },
    { user: 'Admin 2', action: 'editó un documento', timestamp: new Date().toLocaleString() },
    { user: 'Admin 3', action: 'cerró sesión', timestamp: new Date().toLocaleString() },
];

// Función para mostrar actividades en la lista
function displayActivities(activities) {
    const activityList = document.getElementById('activityList');
    activityList.innerHTML = ''; // Limpiar la lista antes de agregar

    activities.forEach(activity => {
        const listItem = document.createElement('li');
        listItem.textContent = `${activity.user} ${activity.action} - ${activity.timestamp}`;
        activityList.appendChild(listItem);
    });
}

// Simular nuevos movimientos cada 5 segundos
setInterval(() => {
    const newActivity = {
        user: `Admin ${Math.floor(Math.random() * 3) + 1}`, // Selecciona un admin aleatorio
        action: ['inició sesión', 'editó un documento', 'cerró sesión'][Math.floor(Math.random() * 3)],
        timestamp: new Date().toLocaleString()
    };
    
    userActivities.push(newActivity);
    displayActivities(userActivities);
}, 5000);

// Inicializar la vista
displayActivities(userActivities);
