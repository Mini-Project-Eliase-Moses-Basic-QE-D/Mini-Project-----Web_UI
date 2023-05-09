package starter.helpers;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DoAnAction {

    public static Performable fillFullNameFieldWithValue(String FullName) {
        return Task.where("{0} fill FullName field with " + FullName,
                Enter.theValue(FullName)
                        .into(AltaShopPage.FULLNAME_FIELD)
                        .then(WaitUntil.the(AltaShopPage.FULLNAME_FIELD, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))

        );
        // Fungsi untuk mengisi kolom "Nama Lengkap" pada halaman register AltaShop
    }

    public static Performable fillEmailFieldWithValue(String email) {
        return Task.where("{0} fill email field with " + email,
                Enter.theValue(email)
                        .into(AltaShopPage.EMAIL_FIELD)
                        .then(WaitUntil.the(AltaShopPage.EMAIL_FIELD, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))

        );
    }

    public static Performable fillPasswordFieldWithValue(String password) {
        return Task.where("{0} fill password field with " + password,
                Enter.theValue(password)
                        .into(AltaShopPage.PASSWORD_FIELD)
                        .then(WaitUntil.the(AltaShopPage.PASSWORD_FIELD, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))

        );
    }

    public static Performable clickRegisterButton() {
        return Task.where("{0} fill register button",
                Click.on(AltaShopPage.REGISTER_BUTTON)

        );
    }

    public static Performable clickLoginButton() {
        return Task.where("{0} fill login button",
                Click.on("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button")
                        .then(WaitUntil.the("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button", isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );

    }

    public static Performable FillEmailFieldWithValue(String email) {
        return Task.where("{0} fill email field with " + email,
                Enter.theValue(email)
                        .into(AltaLoginPage.Email_Field)
                        .then(WaitUntil.the(AltaLoginPage.Email_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }

    public static Performable FillPasswordFieldWithValue(String password) {
        return Task.where("{0} fill password field with " + password,
                Enter.theValue(password)
                        .into(AltaLoginPage.Password_Field)
                        .then(WaitUntil.the(AltaLoginPage.Password_Field, isCurrentlyVisible())
                                .forNoMoreThan(Duration.ofSeconds(60)))
        );
    }

    public static Performable clickSelectCategory() {
        return Task.where("{0} click category button",
                Click.on(AltaPage.Select_Category)
        );
    }
    public static Performable chooseOneOfTheCategory() {
        return Task.where("{0} choose one of the categories",
                Click.on(AltaPage.Choose_Category_Button)
        );
    }

    public static Performable directedToTheFurniture() {
        return Task.where("{0} directed to the furniture",
                Click.on(AltaPage.Furniture_Page)
        );
    }

    public static Performable clickDetailOnOneProduct() {
        return Task.where("{0} click detail on one product",
                Click.on(AltaPage.Detail_Button)
        );
    }

    public static Performable clickonRating() {
        return Task.where("{0} click on rating stars",
                Click.on(AltaPage.Rating_Stars)
        );
    }
    public static Performable directedToTheProduct() {
        return Task.where("{0} directed to the product",
                Click.on(AltaPage.Product_Page)
        );
    }

    public static Performable clickBuyOnOneProduct() {
        return Task.where("{0} directed to the product",
                Click.on(AltaPage.Buy_Product)
        );
    }
    public static Performable clickOnCart() {
        return Task.where("{0} click on",
                Click.on(AltaPage.Cart_Page)
        );
    }

    public static Performable clickonaddSymbol(){
        return Task.where("{0} add symbol",
                Click.on(AltaPage.Add_Symbol)
        );
    }

    public static Performable clickondetractSymbol(){
        return Task.where("{0} detract symbol",
                Click.on(AltaPage.Detract_Symbol)
        );
    }
    public static Performable payTheProduct() {
        return Task.where("{0} pay the product",
                Click.on(AltaPage.Pay_the_product_page)
        );
    }
    public static Performable clickonlogoutSymbol(){
        return Task.where("{0} logged out",
                Click.on(AltaPage.Logout_symbol)
        );
    }

}

