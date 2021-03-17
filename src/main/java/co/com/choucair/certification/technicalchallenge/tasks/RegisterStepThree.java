package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepThreePage;
import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterStepThree implements Task {

    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strOperatingSystem;

    public RegisterStepThree(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOperatingSystem) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
    }

    public static RegisterStepThree onThePage(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strOperatingSystem){
        return Tasks.instrumented(RegisterStepThree.class, strComputer, strVersion, strLanguage, strMobile, strModel, strOperatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterStepThreePage.SELECT_COMPUTER),
                Enter.theValue(strComputer).into(RegisterStepThreePage.INPUT_COMPUTER),
                Click.on(RegisterStepThreePage.INPUT_COMPUTER_RESULT),
                Click.on(RegisterStepThreePage.SELECT_VERSION),
                Enter.theValue(strVersion).into(RegisterStepThreePage.INPUT_VERSION),
                Click.on(RegisterStepThreePage.INPUT_VERSION_RESULT),
                Click.on(RegisterStepThreePage.SELECT_LANGUAGE),
                Enter.theValue(strLanguage).into(RegisterStepThreePage.INPUT_LANGUAGE),
                Click.on(RegisterStepThreePage.INPUT_LANGUAGE_RESULT),
                Click.on(RegisterStepThreePage.SELECT_MOBILE),
                Enter.theValue(strMobile).into(RegisterStepThreePage.INPUT_MOBILE),
                Click.on(RegisterStepThreePage.INPUT_MOBILE_RESULT),
                Click.on(RegisterStepThreePage.SELECT_MODEL),
                Enter.theValue(strModel).into(RegisterStepThreePage.INPUT_MODEL),
                Click.on(RegisterStepThreePage.INPUT_MODEL_RESULT),
                Click.on(RegisterStepThreePage.SELECT_OPERATING_SYSTEM),
                Enter.theValue(strOperatingSystem).into(RegisterStepThreePage.INPUT_OPERATING_SYSTEM),
                Click.on(RegisterStepThreePage.INPUT_OPERATING_SYSTEM_RESULT),
                Click.on(RegisterStepTwoPage.LINK_NEXT_STEP)
        );
    }
}
