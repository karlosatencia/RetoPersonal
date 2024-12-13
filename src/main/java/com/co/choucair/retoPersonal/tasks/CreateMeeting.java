package com.co.choucair.retoPersonal.tasks;

import com.co.choucair.retoPersonal.models.Meeting;
import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.userInterfaces.MeetingUi;
import com.co.choucair.retoPersonal.userInterfaces.MenuUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.interactions.Actions;

public class CreateMeeting implements Task {
    Meeting meeting;
    UnitBusiness unitBusiness;

    public CreateMeeting(Meeting meeting, UnitBusiness unitBusiness) {
        this.meeting = meeting;
        this.unitBusiness = unitBusiness;
    }
    public static CreateMeeting withMeetingAndUnit(Meeting meeting, UnitBusiness unitBusiness) {
        return Instrumented.instanceOf(CreateMeeting.class).withProperties(meeting, unitBusiness);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        actor.attemptsTo(
                Click.on(MenuUi.reuniones),
                Click.on(MeetingUi.btn_newMeeting),
                Enter.theValue(meeting.getMeetingname()).into(MeetingUi.meetingName),
                Enter.theValue(meeting.getMeetingnumber()).into(MeetingUi.meetingNumber),
                Click.on(MeetingUi.parentUnitMeeting),
                Click.on(MeetingUi.parentUnitOption(unitBusiness.getUnitname())),
                Click.on(MeetingUi.btn_saveMeeting)
        );
    }

}
