package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerifyRegisterPage {
    public static final Target TITLE_REGISTER = Target.the("where do we write the first name")
            .located(By.id("//*[@id='mainContent']//h1"));
}
