package com.co.choucair.retoPersonal.tasks;

import com.co.choucair.retoPersonal.models.Meeting;
import com.co.choucair.retoPersonal.models.MeetingLombookData;
import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.userInterfaces.MeetingUi;
import com.co.choucair.retoPersonal.userInterfaces.MenuUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.Actions;

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
        actor.attemptsTo(
                Click.on(MenuUi.reuniones),
                Click.on(MeetingUi.btn_newMeeting),
                Enter.theValue(meetingLombookData.getMeetingName()).into(MeetingUi.meetingName),
                Enter.theValue(meetingLombookData.getMeetingNumber()).into(MeetingUi.meetingNumber),
                Click.on(MeetingUi.parentUnitMeeting),
                Click.on(MeetingUi.PARENT_UNIT.of(unitName)),
                Click.on(MeetingUi.btn_saveMeeting)
        );
    }

    public static CreateMeeting on(MeetingLombookData meetingLombookData) {
        return Instrumented.instanceOf(CreateMeeting.class).withProperties(meetingLombookData);
    }

}
