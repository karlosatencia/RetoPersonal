package com.co.choucair.retoPersonal.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuUi {
    public static final Target reunion = Target.the("Reunión")
            .located(By.xpath("//span[text()='Reunión']\n"));
    public static final Target unidadesDeNegocio = Target.the("Unidades de negocio")
            .located(By.xpath("//span[text()='Unidades de negocio']"));
    public static final Target reuniones = Target.the("Reuniones")
            .located(By.xpath("//span[text()='Reuniones']"));

}
