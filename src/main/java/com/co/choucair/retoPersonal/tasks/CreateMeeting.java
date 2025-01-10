package com.co.choucair.retoPersonal.tasks;

import com.co.choucair.retoPersonal.models.Meeting;
import com.co.choucair.retoPersonal.models.MeetingLombookData;
import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.userInterfaces.MeetingUi;
import com.co.choucair.retoPersonal.userInterfaces.MenuUi;
import com.co.choucair.retoPersonal.utils.FechaUtil;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateMeeting implements Task {

    protected MeetingLombookData meetingLombookData;
    protected String unitName;

    public CreateMeeting(MeetingLombookData meetingLombookData) {
        this.meetingLombookData = meetingLombookData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        unitName = actor.recall("unitName");
        actor.remember("meetingData", meetingLombookData);
        String fechaConFormato = FechaUtil.obtenerFechaActualConFormato();
        String fechaFin = FechaUtil.obtenerFechaConHoraSumada(1);
        actor.attemptsTo(
                Click.on(MenuUi.reuniones),
                Click.on(MeetingUi.btn_newMeeting),
                Enter.theValue(meetingLombookData.getMeetingName()).into(MeetingUi.meetingName),
                Click.on(MeetingUi.slt_typeMeeting),
                Click.on(MeetingUi.optionTypeMeeting),
                Enter.theValue(meetingLombookData.getMeetingNumber()).into(MeetingUi.meetingNumber),
                Clear.field(MeetingUi.inp_startDate),
                Enter.theValue(fechaConFormato).into(MeetingUi.inp_startDate),
                Clear.field(MeetingUi.inp_endDate),
                Enter.theValue(fechaFin).into(MeetingUi.inp_endDate),
                Click.on(MeetingUi.inp_location),
                Click.on(MeetingUi.optionLocation),
                Click.on(MeetingUi.parentUnitMeeting),
                Click.on(MeetingUi.PARENT_UNIT.of(unitName)),
                Click.on(MeetingUi.inp_organizer),
                Click.on(MeetingUi.optionOrganizer),
                Click.on(MeetingUi.inp_reporter),
                Click.on(MeetingUi.optionReporter),
                Click.on(MeetingUi.inp_assistant),
                SendKeys.of(Keys.ENTER).into(MeetingUi.inp_searchAssistant),
                Click.on(MeetingUi.btn_saveMeeting)
        );
    }

    public static CreateMeeting on(MeetingLombookData meetingLombookData) {
        return Instrumented.instanceOf(CreateMeeting.class).withProperties(meetingLombookData);
    }

}
