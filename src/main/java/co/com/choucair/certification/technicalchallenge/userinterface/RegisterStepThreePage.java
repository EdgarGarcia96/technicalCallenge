package co.com.choucair.certification.technicalchallenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterStepThreePage {
    public static final Target SELECT_COMPUTER = Target.the("where do we select the computer field")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));

    public static final Target INPUT_COMPUTER = Target.the("where do we write the computer")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target INPUT_COMPUTER_RESULT = Target.the("where do we select the computer result")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/ul/li//div[contains(@class, 'ui-select-choices-row')]"));

    public static final Target SELECT_VERSION = Target.the("where do we select the version field")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div"));

    public static final Target INPUT_VERSION = Target.the("where do we write the version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target INPUT_VERSION_RESULT = Target.the("where do we select the version result")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/ul/li//div[contains(@class, 'ui-select-choices-row')]"));

    public static final Target SELECT_LANGUAGE = Target.the("where do we select the language field")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));

    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target INPUT_LANGUAGE_RESULT = Target.the("where do we select the language result")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/ul/li//div[contains(@class, 'ui-select-choices-row')]"));

    public static final Target SELECT_MOBILE = Target.the("where do we select the mobile field")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));

    public static final Target INPUT_MOBILE = Target.the("where do we write the mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target INPUT_MOBILE_RESULT = Target.the("where do we select the mobile result")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/ul/li//div[contains(@class, 'ui-select-choices-row')]"));

    public static final Target SELECT_MODEL = Target.the("where do we select the model field")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));

    public static final Target INPUT_MODEL = Target.the("where do we write model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target INPUT_MODEL_RESULT = Target.the("where do we select the model result")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/ul/li//div[contains(@class, 'ui-select-choices-row')]"));

    public static final Target SELECT_OPERATING_SYSTEM = Target.the("where do we select the operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where do we write the operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target INPUT_OPERATING_SYSTEM_RESULT = Target.the("where do we select the operating system field")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/ul/li//div[contains(@class, 'ui-select-choices-row')]"));

    public static final Target LINK_NEXT_STEP = Target.the("link to next step")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}
