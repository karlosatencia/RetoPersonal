package com.co.choucair.retoPersonal.tasks;

import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.userInterfaces.MenuUi;
import com.co.choucair.retoPersonal.userInterfaces.UnitBusinessUi;
import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.Actions;

public class CreateUnitBusiness implements Task {

    protected Faker faker = new Faker();
    protected String unitName = faker.rickAndMorty().character();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuUi.reunion),
                Click.on(MenuUi.unidadesDeNegocio),
                Click.on(UnitBusinessUi.btn_newUnit),
                Enter.theValue(unitName).into(UnitBusinessUi.unitName),
                Click.on(UnitBusinessUi.parentUnit),
                Click.on(UnitBusinessUi.optionParentUnit),
                Click.on(UnitBusinessUi.btn_saveUnit)
        );
        actor.remember("unitName", unitName);
    }

    public static CreateUnitBusiness withUnitBusiness() {
        return Instrumented.instanceOf(CreateUnitBusiness.class).withProperties();
    }
}
