package com.co.choucair.retoPersonal.stepdefinitions;

import com.co.choucair.retoPersonal.models.Meeting;
import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.tasks.CreateMeeting;
import com.co.choucair.retoPersonal.tasks.CreateUnitBusiness;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateMeetingStepDefinition {
    @When("schedules a new meeting")
    public void scheduleASnewMeeting(DataTable dataTable) {

        List<Map<String, String>> rows = dataTable.asMaps();

        UnitBusiness unitBusiness = new UnitBusiness();
        unitBusiness.setUnitname(rows.get(0).get("unitname"));


        Meeting meeting = new Meeting();
        meeting.setMeetingname(rows.get(0).get("meetingname"));
        meeting.setMeetingnumber(rows.get(0).get("meetingnumber"));

        theActorInTheSpotlight().attemptsTo(
                CreateMeeting.withMeetingAndUnit(meeting, unitBusiness)
        );

    }
}
