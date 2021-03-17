package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterStepTwo implements Task {
    private String strCity;
    private String strZip;

    public RegisterStepTwo(String strCity, String strZip) {
        this.strCity = strCity;
        this.strZip = strZip;
    }

    public static RegisterStepTwo onThePage(String strCity, String strZip){
        return Tasks.instrumented(RegisterStepTwo.class, strCity, strZip);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterStepTwoPage.INPUT_CITY),
                Enter.theValue(strCity).into(RegisterStepTwoPage.INPUT_CITY),
                Click.on(RegisterStepTwoPage.INPUT_CITY_RESULT),
                Enter.theValue(strZip).into(RegisterStepTwoPage.INPUT_ZIP),
                Click.on(RegisterStepTwoPage.LINK_NEXT_STEP)
        );
    }
}
