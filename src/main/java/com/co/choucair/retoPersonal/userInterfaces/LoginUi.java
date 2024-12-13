package com.co.choucair.retoPersonal.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUi {
    public static final Target user = Target.the("Usuario")
            .located(By.id("LoginPanel0_Username"));
    public static final Target password = Target.the("Contraseña")
            .located(By.id("LoginPanel0_Password"));
    public static final Target btn_login = Target.the("btn_login")
            .located(By.id("LoginPanel0_LoginButton"));
}
