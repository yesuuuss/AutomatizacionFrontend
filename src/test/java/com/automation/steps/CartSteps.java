package com.automation.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.automation.tasks.ManageCart;

public class CartSteps {

    @Given("que el usuario ha iniciado sesión y está en la página de productos")
    public void elUsuarioEstaEnLaPaginaDeProductos() {
        Actor usuario = OnStage.theActorCalled("Usuario");
  }

    @When("el usuario añade un producto al carrito")
    public void elUsuarioAñadeUnProductoAlCarrito() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(ManageCart.addProduct());
    }

    @Then("el producto debería aparecer en el carrito")
    public void elProductoDeberiaAparecerEnElCarrito() {

    }

    @Given("que el usuario tiene un producto en el carrito")
    public void elUsuarioTieneUnProductoEnElCarrito() {

    }

    @When("el usuario procede al pago")
    public void elUsuarioProcedeAlPago() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(ManageCart.proceedToCheckout());
    }

    @Then("la compra debería completarse con éxito")
    public void laCompraDeberiaCompletarseConExito() {

    }

    @Given("que el usuario tiene varios productos en el carrito")
    public void elUsuarioTieneVariosProductosEnElCarrito() {

    }

    @When("el usuario elimina un producto")
    public void elUsuarioEliminaUnProducto() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(ManageCart.removeProduct());
    }

    @When("procede al pago")
    public void elUsuarioProcedeAlPagoDespuesDeEliminarUnProducto() {
        Actor usuario = OnStage.theActorInTheSpotlight();
        usuario.attemptsTo(ManageCart.proceedToCheckout());
    }

    @Then("la compra debería completarse con los productos restantes")
    public void laCompraDeberiaCompletarseConLosProductosRestantes() {

    }
}
