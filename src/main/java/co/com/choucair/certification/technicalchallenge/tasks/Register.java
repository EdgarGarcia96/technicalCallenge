package co.com.choucair.certification.technicalchallenge.tasks;

import co.com.choucair.certification.technicalchallenge.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.support.ui.Select;

public class Register implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;

    public Register(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }

    public static Register onThePage(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear){
        return Tasks.instrumented(Register.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(RegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(RegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(RegisterPage.INPUT_EMAIL),
                SelectFromOptions.byValue(strBirthMonth).from(RegisterPage.SELECT_BIRTH_MONTH),
                SelectFromOptions.byValue(strBirthDay).from(RegisterPage.SELECT_BIRTH_DAY),
                SelectFromOptions.byValue(strBirthYear).from(RegisterPage.SELECT_BIRTH_YEAR),
                Click.on(RegisterPage.LINK_NEXT_STEP)
        );
    }
}
