package com.co.choucair.retoPersonal.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingUi {

    public static final Target btn_newMeeting = Target.the("Reuniones")
            .located(By.xpath("//span[text()='Nuevo Reunión']"));
    public static final Target meetingName = Target.the("Nombre reunión")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target meetingNumber = Target.the("Número reunión")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target parentUnitMeeting = Target.the("Unidad padre reunión")
            .located(By.id("select2-chosen-8"));
    public static Target parentUnitOption(String unitname) {
        String xpath = String.format("//div[@class='select2-result-label' and text()='Administration » %s']", unitname);
        return Target.the("Opción de unidad padre").located(By.xpath(xpath));
    }
    public static final Target btn_saveMeeting = Target.the("Guardar reunion")
            .located(By.xpath("//span[text()='Guardar']"));
    public static Target meetingWithName(String meetingName) {
        return Target.the("Meeting with name " + meetingName)
                .locatedBy("//a[text()='{0}']").of(meetingName);
    }
}
