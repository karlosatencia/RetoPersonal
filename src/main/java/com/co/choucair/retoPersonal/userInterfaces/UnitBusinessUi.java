package com.co.choucair.retoPersonal.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UnitBusinessUi {
     public static final Target btn_newUnit = Target.the("btn_nuevaUnidad")
             .located(By.xpath("//span[text()='Nuevo Unidad de negocio']"));
    public static final Target unitName = Target.the("Nombre Unidad")
            .located(By.id("Serenity_Pro_Meeting_BusinessUnitDialog3_Name"));
    public static final Target parentUnit = Target.the("Unidad padre")
            .located(By.id("select2-chosen-1"));
    public static final Target optionParentUnit = Target.the("Opción unidad padre")
            .located(By.xpath("//div[@class='select2-result-label' and text()='Administration']"));
    public static final Target btn_saveUnit = Target.the("btn_guardarUnidad")
            .located(By.xpath("//span[text()='Guardar']"));

}
