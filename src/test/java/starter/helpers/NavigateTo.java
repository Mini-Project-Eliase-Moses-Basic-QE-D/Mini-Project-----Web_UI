package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theAltaShopPage() {
        return Task.where("{0} opens the AltaShop home page",
                Open.browserOn().the(AltaShopPage.class));

    }
    public static Performable theAltaLoginPage() {
        return Task.where("{0} opens the AltaShop login page",
                Open.browserOn().the(AltaLoginPage.class));
    }
}
