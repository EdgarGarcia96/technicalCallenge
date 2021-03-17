package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterStepFourPage {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMED_PASSWORD = Target.the("where do we write the confirmed password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERM_OF_USE = Target.the("where do we check the term of use")
            .located(By.id("termOfUse"));

    public static final Target CHECK_PRIVACY_SETTING = Target.the("where do we check the privacy settings")
            .located(By.id("privacySetting"));

    public static final Target REGISTER_BUTTON = Target.the("button to register")
            .located(By.id("laddaBtn"));


}
