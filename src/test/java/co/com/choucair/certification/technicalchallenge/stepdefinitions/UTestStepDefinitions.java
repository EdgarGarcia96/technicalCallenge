package co.com.choucair.certification.technicalchallenge.stepdefinitions;

import co.com.choucair.certification.technicalchallenge.tasks.Join;
import co.com.choucair.certification.technicalchallenge.tasks.OpenUp;
import co.com.choucair.certification.technicalchallenge.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than arturo wants to create a new user$")
    public void thanArturoWantsToCreateANewUser() {
        OnStage.theActorCalled("Arturo").wasAbleTo(OpenUp.thePage(), (Join.onThePage()));
    }

    @When("^he fill out the form fields$")
    public void heFillOutTheFormFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onThePage("Arturo", "Garcia", "arturo789754@gmail.com", "number:2", "number:12", "number:1996"));
    }

    @Then("^he creates the new user on the UTest page$")
    public void heCreatesTheNewUserOnTheUTestPage() {
    }
}
