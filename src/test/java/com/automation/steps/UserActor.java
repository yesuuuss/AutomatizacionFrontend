package com.automation.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.automation.tasks.Login;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class LoginSteps {

    @Given("que el usuario navega a la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        Actor usuario = OnStage.theActorCalled("Usuario");
    }

    @When("el usuario ingresa credenciales válidas")
    public void elUsuarioIngresaCredencialesValidas() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(Login.conCredenciales("usuarioValido", "contraseñaValida"));
    }

    @Then("el usuario debería ser redirigido a la página de productos")
    public void elUsuarioDeberiaSerRedirigidoALaPaginaDeProductos() {

    }

    @When("el usuario ingresa credenciales inválidas")
    public void elUsuarioIngresaCredencialesInvalidas() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(Login.conCredenciales("usuarioInvalido", "contraseñaInvalida"));
    }

    @Then("se debería mostrar un mensaje de error")
    public void seDeberiaMostrarUnMensajeDeError() {

    }
}
