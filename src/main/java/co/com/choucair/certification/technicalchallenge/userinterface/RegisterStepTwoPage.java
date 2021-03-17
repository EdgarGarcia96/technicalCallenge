package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterStepTwoPage {
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));

    public static final Target INPUT_CITY_RESULT = Target.the("where do we select the city")
            .located(By.xpath("//div[contains(@class, 'pac-container pac-logo')]//div[contains(@class, 'pac-item')]"));

    public static final Target INPUT_ZIP = Target.the("where do we write the postal code")
            .located(By.id("zip"));

    public static final Target LINK_NEXT_STEP = Target.the("link to next step two")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
