package com.co.choucair.retoPersonal.tasks;

import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.userInterfaces.MenuUi;
import com.co.choucair.retoPersonal.userInterfaces.UnitBusinessUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.Actions;

public class CreateUnitBusiness implements Task {
    UnitBusiness unitBusiness;
    public CreateUnitBusiness(UnitBusiness unitBusiness) {
        this.unitBusiness = unitBusiness;
    }
    public static CreateUnitBusiness withUnitBusiness(UnitBusiness unitBusiness) {
        return Instrumented.instanceOf(CreateUnitBusiness.class).withProperties(unitBusiness);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actor.attemptsTo(
                Click.on(MenuUi.reunion),
                Click.on(MenuUi.unidadesDeNegocio),
                Click.on(UnitBusinessUi.btn_newUnit),
                Enter.theValue(unitBusiness.getUnitname()).into(UnitBusinessUi.unitName),
                Click.on(UnitBusinessUi.parentUnit),
                Click.on(UnitBusinessUi.optionParentUnit),
                Click.on(UnitBusinessUi.btn_saveUnit)
        );

    }
}
