/**
 * CUANDO SE CARGA LA PÁGINA ENTERA
 */
$(document).ready(function () {});

/**
 * MÉTODO INICIAR SESION
 * EN LA PLATAFORMA
 */
async function iniciarSesion() {
  let datos = {};
  datos.email = document.getElementById("ingresaEmail").value;
  datos.password = document.getElementById("ingresaPassword").value;

  const rawResponse = await fetch("api/login", {
    method: "POST",
    headers: {
      Accept: "application/json",
      "Content-Type": "application/json",
    },
    body: JSON.stringify(datos),
  });
  const respuesta = await rawResponse.text();
  if (respuesta == "Ok") {
    window.location.href = "usuarios.html";
  } else {
    alert("Las credenciales son incorrectas");
  }
}
