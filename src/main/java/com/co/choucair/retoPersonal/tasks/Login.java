package com.co.choucair.retoPersonal.tasks;

import com.co.choucair.retoPersonal.models.UserCredentials;
import com.co.choucair.retoPersonal.userInterfaces.LoginUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    UserCredentials userCredentials;
    public Login(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }
    public static Login withCredentials(UserCredentials userCredentials) {
        return Instrumented.instanceOf(Login.class).withProperties(userCredentials);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userCredentials.getUsername()).into(LoginUi.user),
                Enter.theValue(userCredentials.getPassword()).into(LoginUi.password),
                Click.on(LoginUi.btn_login)
        );
    }
}
