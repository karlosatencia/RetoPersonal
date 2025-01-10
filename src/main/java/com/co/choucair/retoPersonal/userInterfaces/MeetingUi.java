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

    public static final Target PARENT_UNIT = Target.the("Unidad padre")
            .locatedBy("//div[@class='select2-result-label' and text()='Administration » {0}']");
    public static final Target btn_saveMeeting = Target.the("Guardar reunion")
            .located(By.xpath("//span[text()='Guardar']"));
    public static Target meetingWithName(String meetingName) {
        return Target.the("Meeting with name " + meetingName)
                .locatedBy("//a[text()='{0}']").of(meetingName);
    }
    public static final Target slt_typeMeeting = Target.the("Tipo de reunión")
            .located(By.id("select2-chosen-6"));
    public static final Target optionTypeMeeting = Target.the("Opción tipo de reunión")
            .located(By.id("select2-result-label-14"));
    public static final Target inp_startDate = Target.the("Fecha de inicio")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target inp_endDate = Target.the("Fecha de fin")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target inp_location = Target.the("Ubicación")
            .located(By.id("select2-chosen-7"));
    public static final Target optionLocation = Target.the("Opción ubicación")
            .located(By.id("select2-result-label-23"));
    public static final Target inp_organizer = Target.the("Organizador")
            .located(By.id("select2-chosen-9"));
    public static final Target optionOrganizer = Target.the("Opción organizador")
            .located(By.id("select2-result-label-128"));
    public static final Target inp_reporter = Target.the("Reportero")
            .located(By.id("select2-chosen-10"));
    public static final Target optionReporter = Target.the("Opción reportero")
            .located(By.id("select2-result-label-228"));
    public static final Target inp_assistant = Target.the("Asistente")
            .located(By.id("select2-chosen-12"));
    public static final Target inp_searchAssistant = Target.the("Buscador asistente")
            .located(By.id("s2id_autogen12_search"));

}
