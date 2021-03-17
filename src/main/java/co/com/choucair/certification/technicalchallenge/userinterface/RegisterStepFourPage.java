package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterStepFourPage {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the first name")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMED_PASSWORD = Target.the("where do we write the first name")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERM_OF_USE = Target.the("where do we write the first name")
            .located(By.id("termOfUse"));

    public static final Target CHECK_PRIVACY_SETTING = Target.the("where do we write the first name")
            .located(By.id("privacySetting"));

    public static final Target REGISTER_BUTTON = Target.the("where do we write the first name")
            .located(By.id("laddaBtn"));


}
