document.addEventListener("DOMContentLoaded", function () {

  //   url apara el backend  \\
  var baseUrl = 'http://localhost:9000/proyectoGT';

  // Seleccionar las tarjetas y el contenedor
  const cards = Array.from(document.querySelectorAll(".card"));
  const cardsContainer = document.querySelector("#cards");
  // SubMenu de los Navbar
  function toggleSubMenu(option) {
    // Ocultar ambos submenús
    document.getElementById('subIniciar').style.display = 'none';
    document.getElementById('subRegistrar').style.display = 'none';

    // Marcar como activo
    const iniciarLink = document.getElementById('Iniciar');
    const registrarLink = document.getElementById('Registrar');

    iniciarLink.classList.remove('active');
    registrarLink.classList.remove('active');

    // Mostrar el submenú correspondiente y marcar como activo
    if (option === 'Iniciar') {
      const subIniciar = document.getElementById('subIniciar');
      subIniciar.style.display = 'block';
      iniciarLink.classList.add('active');

      // Evitar que se cierre al pasar sobre el submenú
      subIniciar.addEventListener('mouseleave', function () {
        this.style.display = 'none';
        iniciarLink.classList.remove('active');
      });
    } else if (option === 'Registrar') {
      const subRegistrar = document.getElementById('subRegistrar');
      subRegistrar.style.display = 'block';
      registrarLink.classList.add('active');

      // Evitar que se cierre al pasar sobre el submenú
      subRegistrar.addEventListener('mouseleave', function () {
        this.style.display = 'none';
        registrarLink.classList.remove('active');
      });
    }
  }

  function signInWithGoogle() {
    const params = {
      'client_id': '384725443240-vse57qkt738vvmbouajmjfu5vccaf8h8.apps.googleusercontent.com', // Reemplaza con tu Client ID
    };

    // Cargar la nueva biblioteca
    const g_id_onload = {
      client_id: params.client_id,
      callback: onSignIn
    };

    // Renderizar el botón de inicio de sesión
    google.accounts.id.initialize(g_id_onload);
    google.accounts.id.prompt(); // Muestra el cuadro de diálogo One Tap
  }

  function onSignIn(response) {
    const id_token = response.credential;

    // Aquí puedes enviar el token a tu backend
    fetch('/api/auth/google', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ id_token: id_token })
    })
      .then(response => response.json())
      .then(data => {
        console.log(data);
        // Maneja la respuesta de tu backend
      })
      .catch(error => {
        console.error('Error:', error);
      });
  }



  //  Funcion de registro de Facebook  \\
  function loginWithFacebook() {
    console.log("Login with Facebook clicked");
    const appId = '';
    const redirectUri = 'YOUR_REDIRECT_URI'; // Debe estar registrado en tu app de Facebook
    const scope = 'email';
    const url = `https://www.facebook.com/v12.0/dialog/oauth?client_id=${appId}&redirect_uri=${redirectUri}&scope=${scope}`;

    const popup = window.open(url, 'facebookLogin', 'width=600,height=600');

    const interval = setInterval(() => {
      if (popup.closed) {
        clearInterval(interval);
        // Aquí puedes manejar la lógica después del cierre de la ventana
      }
    }, 1000);
  }

  // Exponer las funciones al ámbito global si es necesario
  window.signInWithGoogle = signInWithGoogle;
  window.loginWithFacebook = loginWithFacebook;
  window.toggleSubMenu = toggleSubMenu;





  function validateAndSignIn() {
    const email = document.getElementById('registerInput').value.trim();
    const password = document.getElementById('registerPasswordInput').value.trim();
    const confirmPassword = document.getElementById('confirmPasswordInput').value.trim();

    // Validaciones
    if (!email || !password || !confirmPassword) {
      Swal.fire({
        icon: 'warning',
        title: 'Advertencia',
        text: 'Por favor completa todos los campos',
      });
      return;
    }

    if (password !== confirmPassword) {
      Swal.fire({
        icon: 'warning',
        title: 'Advertencia',
        text: 'Las contraseñas no coinciden',
      });
      return;
    }

    const createdAt = new Date().toISOString(); // Fecha de creación

    const user = {
      userName: email,  // Guardar el correo electrónico como userName
      contrasenia: password,  // Guardar la contraseña
      createdAt: createdAt, // Fecha de creación del usuario
      deletedAt: null, // Ajustar según tu lógica (null en lugar de la fecha actual)
      rol: {
        createdAt: createdAt // Agregando createdAt al rol
      }
    };

    // Hacer la petición POST al backend usando AJAX
    $.ajax({
      url: baseUrl + '/Seguridad/Usuarios/GuardarUsuarioJwt',
      type: 'POST',
      contentType: 'application/json',
      data: JSON.stringify(user),
      success: function (response) {
        Swal.fire({
          icon: 'success',
          title: 'Éxito',
          text: 'Usuario registrado exitosamente',
        }).then(() => {
          // Limpiar los campos
          document.getElementById('registerInput').value = '';
          document.getElementById('registerPasswordInput').value = '';
          document.getElementById('confirmPasswordInput').value = '';
          // Cerrar el modal
          $('#registerModal').modal('hide');
        });
      },
      error: function (jqXHR, textStatus, errorThrown) {
        // Verificar si el error es por duplicado
        if (jqXHR.status === 409) { // 409 Conflict
          Swal.fire({
            icon: 'error',
            title: 'Error',
            text: 'El usuario ya se encuentra registrado',
          });
        } else {
          Swal.fire({
            icon: 'error',
            title: 'Error',
            text: 'Error al registrar el usuario',
          });
        }
        console.error('Error:', textStatus, errorThrown);
      }
    });
  }

  window.validateAndSignIn = validateAndSignIn;

  // Función para mostrar/ocultar la contraseña
  function showHideRegisterPassword() {
    const registerPasswordInput = document.getElementById('registerPasswordInput');
    const toggleRegisterPassword = document.getElementById('toggleRegisterPassword');

    if (registerPasswordInput.type === 'password') {
      registerPasswordInput.type = 'text';
      toggleRegisterPassword.classList.add('active'); // Cambiar a clase activa
    } else {
      registerPasswordInput.type = 'password';
      toggleRegisterPassword.classList.remove('active');
    }
  }

  // Función para mostrar/ocultar la confirmación de contraseña
  function showHideConfirmPassword() {
    const confirmPasswordInput = document.getElementById('confirmPasswordInput');
    const toggleConfirmPassword = document.getElementById('toggleConfirmPassword');
    if (confirmPasswordInput.type === 'password') {
      confirmPasswordInput.type = 'text';
      toggleConfirmPassword.classList.add('active');
    } else {
      confirmPasswordInput.type = 'password';
      toggleConfirmPassword.classList.remove('active');
    }
  }

  //  fucnion de login del usuario   \\
  function login() {
    const username = $('#inisiousernameinput').val().trim();
    const password = $('#inisiopasswordinput').val().trim();

    if (!username || !password) {
      Swal.fire({
        icon: 'warning',
        title: 'Advertencia',
        text: 'Por favor completa todos los campos',
      });
      return;
    }

    const authRequest = {
      username: username,
      password: password
    };

    $.ajax({
      url: baseUrl + '/jwt/auth/login',
      method: 'POST',
      contentType: 'application/json',
      data: JSON.stringify(authRequest),
      success: function (data) {
        console.log(data); // Manejar el token de JWT aquí
        Swal.fire({
          icon: 'success',
          title: 'Éxito',
          text: 'Inicio de sesión exitoso',
        });
        localStorage.setItem('jwt', data.jwt); // Guardar el token
        $('#loginModal').modal('hide'); // Cerrar el modal
        // Redirigir o cargar el contenido del usuario
      },
      error: function (xhr) {
        Swal.fire({
          icon: 'error',
          title: 'Error',
          text: xhr.responseJSON ? xhr.responseJSON.message : 'Error en las credenciales',
        });
        console.error('Error:', xhr);
      }
    });
  }

  function showHidePassword() {
    const passwordInput = document.getElementById('inisiopasswordinput');
    const toggle = document.getElementById('toggle');

    if (passwordInput.type === 'password') {
      passwordInput.type = 'text'; // Cambiar a texto
      toggle.classList.add('hide'); // Cambiar icono
    } else {
      passwordInput.type = 'password'; // Volver a contraseña
      toggle.classList.remove('hide'); // Remover clase
    }
  }


  // Asegúrate de que la función login esté disponible globalmente si es necesario
  window.login = login;



  // Asegúrate de que la función sea accesible globalmente
  window.showHidePassword = showHidePassword;
  window.showHideRegisterPassword = showHideRegisterPassword;
  window.showHideConfirmPassword = showHideConfirmPassword;


});

let password = document.getElementById('password');
let togglePassword = document.getElementById('toggle');

function showHide() {
  if (password.type === 'password') {
    password.setAttribute('type', 'text');
    togglePassword.classList.add('hide');
  } else {
    password.setAttribute('type', 'password');
    togglePassword.classList.remove('hide');
  }
}

const images = [
  "../../../ASSET/img/imgLugares/Cavernatigre.jpg", // Imagen grande
  "../../../ASSET/img/imgLugares/cuevadeltigre.jpg", // Imagen pequeña 1
  "../../../ASSET/img/imgLugares/cuevadeltigre.jpg", // Imagen pequeña 2
  "../../../ASSET/img/imgLugares/cuevadeltigre.jpg"  // Imagen pequeña 3
];

let currentIndex = 0;

function openModal(index) {
  currentIndex = index; // Establece el índice actual
  updateModalImage(); // Actualiza la imagen en el modal
  document.getElementById("imageModal").style.display = "block"; // Muestra el modal
}

function closeModal() {
  document.getElementById("imageModal").style.display = "none"; // Oculta el modal
}

function changeImage(direction) {
  currentIndex += direction; // Cambia el índice según la dirección
  if (currentIndex < 0) currentIndex = images.length - 1; // Volver al último si está en el primero
  if (currentIndex >= images.length) currentIndex = 0; // Volver al primero si está en el último
  updateModalImage(); // Actualiza la imagen en el modal
}

function updateModalImage() {
  const modalImage = document.getElementById("modalImage");
  modalImage.src = images[currentIndex]; // Actualiza la imagen del modal
}