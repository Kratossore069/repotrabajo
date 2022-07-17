/**
 * CUANDO SE CARGA LA PÁGINA ENTERA
 */
$(document).ready(function () {});

/**
 * MÉTODO QUE REGISTRA UN USUARIO NUEVO
 * PARA LA BASE DE DATOS
 */
async function registrarUsuario() {
  let datos = {};
  datos.nombre = document.getElementById("nuevoNombre").value;
  datos.apellido = document.getElementById("nuevoApellido").value;
  datos.email = document.getElementById("nuevoEmail").value;
  datos.password = document.getElementById("nuevoPassword").value;

  let repetirPassword = document.getElementById("nuevoRepetirPassword").value;

  if (repetirPassword != datos.password) {
    alert("Las contraseñas no coinciden");
    return;
  }

  const rawResponse = await fetch("api/usuario", {
    method: "POST",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
    body: JSON.stringify(datos),
  });
  const usuarios = await rawResponse.json();
}
