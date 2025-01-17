package com.co.choucair.retoPersonal.stepdefinitions;

import com.co.choucair.retoPersonal.models.UserCredentials;
import com.co.choucair.retoPersonal.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.retoPersonal.utils.Constants.ACTOR;
import static com.co.choucair.retoPersonal.utils.Constants.URL;

public class LoginStepDefinitions {

    @Given("the user enters the Demo Serenity website")
    public void theUserEntersTheDemoSerenityWebsite() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));
    }

    @When("logs in with valid credentials")
    public void logsInWithValidCredentials(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(UserCredentials.setData(dataTable).get(0))
        );
    }
}
