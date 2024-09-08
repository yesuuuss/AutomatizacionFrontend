package com.automation.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import com.automation.tasks.Login;

public class LoginSteps {

    @Dado("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        Actor usuario = OnStage.theActorCalled("Usuario");

    }

    @Cuando("el usuario ingresa credenciales válidas")
    public void elUsuarioIngresaCredencialesValidas() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(Login.conCredenciales("usuarioValido", "contraseñaValida"));
    }

    @Entonces("el usuario debería ser redirigido a la página principal")
    public void elUsuarioDeberiaSerRedirigidoALaPaginaPrincipal() {

    }

    @Cuando("el usuario ingresa credenciales inválidas")
    public void elUsuarioIngresaCredencialesInvalidas() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(Login.conCredenciales("usuarioInvalido", "contraseñaInvalida"));
    }

    @Entonces("se debería mostrar un mensaje de error")
    public void seDeberiaMostrarUnMensajeDeError() {

    }
}