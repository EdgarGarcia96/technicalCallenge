package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterStepFour implements Task {
    private String strPassword;
    private String strConfirmedPassword;

    public RegisterStepFour(String strPassword, String strConfirmedPassword) {
        this.strPassword = strPassword;
        this.strConfirmedPassword = strConfirmedPassword;
    }

    public static RegisterStepFour onThePage(String strPassword, String strConfirmedPassword){
        return Tasks.instrumented(RegisterStepFour.class, strPassword, strConfirmedPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(RegisterStepFourPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmedPassword).into(RegisterStepFourPage.INPUT_CONFIRMED_PASSWORD),
                Click.on(RegisterStepFourPage.CHECK_TERM_OF_USE),
                Click.on(RegisterStepFourPage.CHECK_PRIVACY_SETTING),
                Click.on(RegisterStepFourPage.REGISTER_BUTTON)
        );
    }
}
