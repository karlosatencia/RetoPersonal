package com.co.choucair.retoPersonal.stepdefinitions;

import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.tasks.CreateUnitBusiness;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.retoPersonal.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUnitStepDefinition {

    @When("the user creates a new business unit")
    public void theUserCreatesANewBusinessUnit() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateUnitBusiness.withUnitBusiness()
        );
    }

    @Then("he will validate the business unit created")
    public void heWillValidateTheBusinessUnitCreated() {
    }
}
