package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepOnePage;
import co.com.choucair.certification.technicalchallenge.userinterface.RegisterStepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterStepOne implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strLanguage;

    public RegisterStepOne(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strLanguage) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strLanguage = strLanguage;
    }

    public static RegisterStepOne onThePage(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strLanguage){
        return Tasks.instrumented(RegisterStepOne.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear, strLanguage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(RegisterStepOnePage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(RegisterStepOnePage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(RegisterStepOnePage.INPUT_EMAIL),
                SelectFromOptions.byValue(strBirthMonth).from(RegisterStepOnePage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byValue(strBirthDay).from(RegisterStepOnePage.SELECT_BIRTH_DAY),
                SelectFromOptions.byValue(strBirthYear).from(RegisterStepOnePage.SELECT_BIRTH_YEAR),
                Click.on(RegisterStepOnePage.INPUT_LANGUAGE),
                Enter.theValue(strLanguage).into(RegisterStepOnePage.INPUT_LANGUAGE),
                Click.on(RegisterStepOnePage.INPUT_LANGUAGE_RESULT),
                Click.on(RegisterStepOnePage.LINK_NEXT_STEP)

        );
    }
}
