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
@DefaultUrl("https://alta-shop.vercel.app/")
class AltaPage extends PageObject {
    public static Target Choose_Category_Button = Target.the("choose category button").locatedBy("//*[@id=\"list-item-1739-0\"]/div/div");
    public static Target Category_Button = Target.the("category button").locatedBy("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/div[1]/div[1]");
    public static Target Furniture_Page = Target.the("furniture page").locatedBy("//*[@id=\"app\"]/div[1]/main/div");
    public static Target Detail_Field = Target.the("Detail button").locatedBy("//*[@id=\"13364\"]/div/div[3]/div[2]/button[1]/span");
    public static Target Product_Page = Target.the("Product Page").locatedBy("//*[@id=\"app\"]/div/main/div");
    public static Target Buy_Product = Target.the("Buy Product").locatedBy("//*[@id=\"13364\"]/div/div[3]/div[2]/button[2]/span");
    public static Target Cart_Page = Target.the("Cart Page").locatedBy("//*[@id=\"app\"]/div/main/div");
    public static Target Pay_the_product_page = Target.the("Pay the Product Page"). locatedBy("//*[@id=\"app\"]/div/main/div");
    public static Target Logout_symbol = Target.the("logged out"). locatedBy("//*[@id=\"app\"]/div/header/div/button[2]/span/i");
}
