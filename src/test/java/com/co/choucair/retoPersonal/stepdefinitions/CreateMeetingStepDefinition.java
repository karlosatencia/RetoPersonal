package com.co.choucair.retoPersonal.stepdefinitions;

import com.co.choucair.retoPersonal.models.Meeting;
import com.co.choucair.retoPersonal.models.MeetingLombookData;
import com.co.choucair.retoPersonal.models.UnitBusiness;
import com.co.choucair.retoPersonal.questions.ValidateMeetingCreated;
import com.co.choucair.retoPersonal.tasks.CreateMeeting;
import com.co.choucair.retoPersonal.tasks.CreateUnitBusiness;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

import static com.co.choucair.retoPersonal.utils.Constants.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateMeetingStepDefinition {
    @When("the user attempts to schedule a new meeting with")
    public void theUserAttemptsToScheduleANewMeetingWith(DataTable table) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateUnitBusiness.withUnitBusiness(),
                CreateMeeting.on(MeetingLombookData.setData(table).get(0))
        );
    }

    @Then("the system should confirm that the meeting is created successfully")
    public void theSystemShouldConfirmThatTheMeetingIsCreatedSuccessfully() {

        MeetingLombookData meeting = theActorInTheSpotlight().recall("meetingData");
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        ValidateMeetingCreated.withName(meeting.getMeetingName())
                )
        );
    }
}
