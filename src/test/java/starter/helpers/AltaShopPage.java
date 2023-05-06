package starter.helpers;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.time.Duration;


@DefaultUrl("https://alta-shop.vercel.app/auth/register")
public class AltaShopPage extends PageObject {
    public static Target FULLNAME_FIELD = Target.the("full name field").locatedBy("//*[@id=\"input-18\"]");
    public static Target EMAIL_FIELD = Target.the("email field").locatedBy("//*[@id=\"input-21\"]");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("//*[@id=\"input-24\"]");
    public static Target REGISTER_BUTTON = Target.the("register button").locatedBy("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button")
            .waitingForNoMoreThan(Duration.ofSeconds(50));
    }

@DefaultUrl("https://alta-shop.vercel.app/auth/login")
class AltaLoginPage extends PageObject {
    public static Target Email_Field = Target.the("email field").locatedBy("//*[@id=\"input-18\"]");
    public static Target Password_Field = Target.the("password field").locatedBy("//*[@id=\"input-21\"]");

}
