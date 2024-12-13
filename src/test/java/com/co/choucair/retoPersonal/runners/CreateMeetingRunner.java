package com.co.choucair.retoPersonal.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //Define la ruta donde se encuentran los archivos .feature
        features = "src/test/resources/features/createMeeting.feature",
        tags = "@CreateMeeting",
        glue = "com.co.choucair.retoPersonal.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreateMeetingRunner {
}
