package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestJoinPage {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to create user")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
