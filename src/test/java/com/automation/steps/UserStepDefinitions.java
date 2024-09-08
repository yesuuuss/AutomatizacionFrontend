package com.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class UserStepDefinitions {

    @Given("the user navigates to the login page")
    public void theUserNavigatesToTheLoginPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").attemptsTo(

        );
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials("standard_user", "secret_sauce")
        );
    }

    @Then("the user should be redirected to the products page")
    public void theUserShouldBeRedirectedToTheProductsPage() {

    }
}
