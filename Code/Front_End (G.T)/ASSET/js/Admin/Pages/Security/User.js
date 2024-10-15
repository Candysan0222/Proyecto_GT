$(document).ready(function() {
    $('#agregarUsuariosBtn').click(function() {
        $('#modalUsuarios').modal('show');
    });
});


//  Código de usuarios  \\
$(document).ready(function() {
    var baseUrl = 'http://127.0.0.1:9000/proyectoGT/Seguridadd/Usuarios';
    var currentUserId = null;

    // Mostrar el modal al hacer clic en el botón "Agregar"
    $('#agregarUsuariosBtn').click(function() {
        $('#modalUsuarios').modal('show');
        currentUserId = null; // Reiniciar el ID al agregar un nuevo usuario
        $('#usuariosForm')[0].reset(); // Limpiar el formulario
    });

    // Función para guardar o actualizar un usuario
    $('#guardarUsuarios').click(function() {
        var usuario = {
            name: $('#name').val(),
            contrasenia: $('#contrasenia').val(),
            foto: $('#foto')[0].files[0],
            personasId: $('#personasId').val(),
            rolesID: $('#rolesID').val()
        };

        var formData = new FormData();
        formData.append('name', usuario.name);
        formData.append('contrasenia', usuario.contrasenia);
        formData.append('foto', usuario.foto);
        formData.append('personasId', usuario.personasId);
        formData.append('rolesID', usuario.rolesID);

        if (currentUserId) {
            $.ajax({
                url: `${baseUrl}/${currentUserId}`,
                type: 'PUT',
                data: formData,
                processData: false,
                contentType: false,
                success: function() {
                    Swal.fire('Éxito', 'Usuario actualizado correctamente', 'success');
                    $('#modalUsuarios').modal('hide');
                    obtenerUsuarios();
                },
                error: function() {
                    Swal.fire('Error', 'Ocurrió un error al actualizar el usuario', 'error');
                }
            });
        } else {
            // Crear nuevo usuario
            $.ajax({
                url: `${baseUrl}/GuardarUsuarioJwt`,
                type: 'POST',
                data: formData,
                processData: false,
                contentType: false,
                success: function() {
                    Swal.fire('Éxito', 'Usuario guardado correctamente', 'success');
                    $('#modalUsuarios').modal('hide');
                    obtenerUsuarios();
                },
                error: function() {
                    Swal.fire('Error', 'Ocurrió un error al guardar el usuario', 'error');
                }
            });
        }
    });

    // Función para obtener todos los usuarios
    function obtenerUsuarios() {
        $.ajax({
            url: `${baseUrl}/`,
            type: 'GET',
            success: function(response) {
                var tbody = $('#usuariosTable tbody');
                tbody.empty();
                response.forEach(function(usuario) {
                    tbody.append(`
                        <tr>
                            <td>${usuario.id}</td>
                            <td>${usuario.fechaCreacion}</td>
                            <td>${usuario.fechaModificacion}</td>
                            <td>${usuario.fechaEliminacion}</td>
                            <td>${usuario.name}</td>
                            <td>${usuario.contrasenia}</td>
                            <td>${usuario.estado}</td>
                            <td>
                                <button class="btn btn-warning btn-sm" onclick="editarUsuario(${usuario.id})">Editar</button>
                                <button class="btn btn-danger btn-sm" onclick="eliminarUsuario(${usuario.id})">Eliminar</button>
                            </td>
                        </tr>
                    `);
                });
            },
            error: function() {
                Swal.fire('Error', 'Ocurrió un error al obtener usuarios', 'error');
            }
        });
    }

    // Función para editar un usuario
    window.editarUsuario = function(id) {
        $.ajax({
            url: `${baseUrl}/${id}`,
            type: 'GET',
            success: function(usuario) {
                $('#name').val(usuario.name);
                $('#contrasenia').val(usuario.contrasenia);
                $('#personasId').val(usuario.personasId);
                $('#rolesID').val(usuario.rolesID);
                $('#modalUsuarios').modal('show');
                currentUserId = usuario.id; // Guardar el ID del usuario actual
            },
            error: function() {
                Swal.fire('Error', 'Ocurrió un error al obtener el usuario', 'error');
            }
        });
    };

    // Función para eliminar un usuario
    window.eliminarUsuario = function(id) {
        $.ajax({
            url: `${baseUrl}/${id}`,
            type: 'DELETE',
            success: function() {
                Swal.fire('Éxito', 'Usuario eliminado correctamente', 'success');
                obtenerUsuarios(); // Actualizar la tabla después de eliminar
            },
            error: function() {
                Swal.fire('Error', 'Ocurrió un error al eliminar el usuario', 'error');
            }
        });
    };

    // Cargar usuarios al iniciar la página
    obtenerUsuarios();
});
