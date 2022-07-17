/**
 * CUANDO SE CARGA LA PÁGINA ENTERA
 */
$(document).ready(function () {
  cargarUsuarios();
  $("#usuarios").DataTable();
});

/**
 * MÉTODO QUE CARGA LOS USUARIOS DE LA BASE
 * DE DATOS A TRAVÉS DE LA API DE JAVA
 */
async function cargarUsuarios() {
  const rawResponse = await fetch("api/usuario", {
    method: "GET",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    } /*, Esto es para un POST
      body: JSON.stringify({a: 1, b: 'Textual content'})*/,
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
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
  });

  location.reload();
}
