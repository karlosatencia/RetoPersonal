package com.co.choucair.retoPersonal.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static java.sql.DriverManager.getDriver;

public class Hooks {
    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }
    @After
    public void close() {
        Serenity.getDriver().close();
    }
}
