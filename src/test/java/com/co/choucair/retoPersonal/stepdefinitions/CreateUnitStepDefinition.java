package com.co.choucair.retoPersonal.stepdefinitions;

import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.tasks.CreateUnitBusiness;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUnitStepDefinition {
    @When("the user creates a new business unit")
    public void theUserCreatesANewBusinessUnit(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                CreateUnitBusiness.withUnitBusiness(UnitBusiness.setData(dataTable).get(0))
        );
    }
}
