package co.com.choucair.certification.technicalchallenge.stepdefinitions;

import co.com.choucair.certification.technicalchallenge.questions.Answer;
import co.com.choucair.certification.technicalchallenge.tasks.*;
import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepFourPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

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
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepOne.onThePage("Arturo", "Garcia", "arturo0001@gmail.com", "number:2", "number:12", "number:1996"));
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepTwo.onThePage("Bogota", "111111"));
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepThree.onThePage("Linux", "Ubuntu", "Spanish", "Motorola", "Moto G8", "Android 10"));
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepFour.onThePage("Probando123456789", "Probando123456789"));
    }

    @Then("^he creates the new user on the UTest page$")
    public void heCreatesTheNewUserOnTheUTestPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Welcome to the world's largest community of freelance software testers!")));
    }
}
