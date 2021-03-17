package co.com.choucair.certification.technicalchallenge.stepdefinitions;

import co.com.choucair.certification.technicalchallenge.model.RegisterData;
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

import java.util.List;

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
    public void heFillOutTheFormFields(List<RegisterData> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepOne.onThePage(registerData.get(0).getStrFirstName(), registerData.get(0).getStrLastName(), registerData.get(0).getStrEmail(), registerData.get(0).getStrBirthMonth(), registerData.get(0).getStrBirthDay(), registerData.get(0).getStrBirthYear(), registerData.get(0).getStrLanguageSpoken()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepTwo.onThePage(registerData.get(0).getStrCity(), registerData.get(0).getStrZip()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepThree.onThePage(registerData.get(0).getStrComputer(), registerData.get(0).getStrVersion(), registerData.get(0).getStrLanguage(), registerData.get(0).getStrMobile(), registerData.get(0).getStrModel(), registerData.get(0).getStrOperatingSystem()));
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterStepFour.onThePage(registerData.get(0).getStrPassword(), registerData.get(0).getStrConfirmedPassword()));
    }

    @Then("^he creates the new user on the UTest page$")
    public void heCreatesTheNewUserOnTheUTestPage(List<RegisterData> registerData) {
        // Se omite por captcha
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(registerData.get(0).getStrVerifyRegister())));
    }
}
