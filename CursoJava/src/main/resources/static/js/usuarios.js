// Call the dataTables jQuery plugin
$(document).ready(function () {
  cargarUsuarios();
  $("#usuarios").DataTable();
});

async function cargarUsuarios() {
  const rawResponse = await fetch("usuario", {
    method: "GET",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    } /*, Esto es para un POST
      body: JSON.stringify({a: 1, b: 'Textual content'})*/,
  });
  const usuarios = await rawResponse.json();

  let listadoHtml = "";
  for (let usuario of usuarios) {
    let usuarioHtml = `<tr>
    <td>${usuario.id}</td>
    <td>${usuario.nombre} ${usuario.apellido}</td><td>${usuario.email}</td><td>${usuario.telefono}</td><td>
        <a href="#" class="btn btn-danger btn-circle btn-sm">
          <i class="fas fa-trash"></i>
        </a>
      </td>
  </tr>`;
    listadoHtml += usuarioHtml;
  }

  document.querySelector("#usuarios tbody").outerHTML = listadoHtml;
}
