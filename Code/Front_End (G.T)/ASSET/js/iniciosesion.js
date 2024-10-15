function IniciarSesion(){
    var mail = $("#email").val();
    var password = $("#password").val();

    $.ajax({
        url: 'http://localhost:9000/proyectoGT/api/v1/auth/login',
        type: 'POST',
        contentType: 'application/json; charset=UTF-8', 
        data: JSON.stringify({
            username: mail,
            password: password
        }),
        success: function(respuesta) {
            console.log(respuesta.jwt)
            localStorage.setItem('Token',respuesta.jwt);
            window.location.href = '../Apartados/Viajes.html';
        },
        error: function(xhr, status, error) {
            console.error('Error:', error); 
        }
    });
    
}



//viajes

function Viajes(){
    console.log(localStorage.getItem('Token'));
    token = localStorage.getItem('Token');
    $.ajax({
        url: 'http://localhost:9000/proyectoGT/Seguridad/Usuarios/',
        type: 'GET',
        headers: {
            'contentType': 'application/json; charset=UTF-8', 
            'Authorization': `Bearer ${token}`
        },        
        success: function(respuesta) {
            
            console.log(respuesta)
        },
        error: function(xhr, status, error) {
            console.error('Error:', error); 
        }
    });
}
