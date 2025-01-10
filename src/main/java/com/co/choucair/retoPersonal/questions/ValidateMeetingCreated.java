package com.co.choucair.retoPersonal.questions;

import com.co.choucair.retoPersonal.userInterfaces.MeetingUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateMeetingCreated implements Question<Boolean> {
    private String meetingName;

    public ValidateMeetingCreated(String meetingName) {

        this.meetingName = meetingName;
    }
    public static ValidateMeetingCreated withName(String meetingName) {
        return new ValidateMeetingCreated(meetingName);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String meetingNameFound = Text.of(MeetingUi.meetingWithName(meetingName)).answeredBy(actor);
        return meetingName.equals(meetingNameFound);
    }
}
