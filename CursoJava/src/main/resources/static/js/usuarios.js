/**
 * CUANDO SE CARGA LA PÁGINA ENTERA
 */
$(document).ready(function () {
  cargarUsuarios();
  $("#usuarios").DataTable();
  actualizarEmailUsuario();
});

/**
 * MÉTODO PARA CAMBIAR EL USUARIO
 * QUE ESTÁ EN LA SESIÓN ACTUAL
 */
function actualizarEmailUsuario() {
  document.getElementById("text-email-usuario").outerHTML = localStorage.email;
}

/**
 * MÉTODO QUE CARGA LOS USUARIOS DE LA BASE
 * DE DATOS A TRAVÉS DE LA API DE JAVA
 */
async function cargarUsuarios() {
  const rawResponse = await fetch("api/usuario", {
    method: "GET",
    headers: getHeaders(),
  });
  const usuarios = await rawResponse.json();

  // MUESTRA EN EL HTML LOS USUARIOS DE ANTES
  let listadoHtml = "";
  for (let usuario of usuarios) {
    let botonEliminar = `<a href="#" onclick="eliminarUsuario(${usuario.id})" class="btn btn-danger btn-circle btn-sm">
    <i class="fas fa-trash"></i>
  </a>`;

    let telefono = usuario.telefono == null ? "-" : usuario.telefono;
    let usuarioHtml = `<tr>
    <td>${usuario.id}</td>
    <td>${usuario.nombre} ${usuario.apellido}</td><td>${usuario.email}</td><td>${telefono}</td><td>
        ${botonEliminar}
      </td>
  </tr>`;
    listadoHtml += usuarioHtml;
  }

  document.querySelector("#usuarios tbody").outerHTML = listadoHtml;
}

function getHeaders() {
  return {
    Accept: "application/json",
    "Content-Type": "application/json",
    Authorization: localStorage.token,
  };
}

/**
 * MÉTODO QUE BORRA LOS USUARIOS DE LA
 * TABLA A PARTIR DE SU ID
 * @param {*} id del usuario
 */
async function eliminarUsuario(id) {
  if (!confirm("¿Desea eliminar este usuario?")) {
    return;
  }

  const rawResponse = await fetch("api/usuario/" + id, {
    method: "DELETE",
    headers: getHeaders(),
  });

  location.reload();
}
