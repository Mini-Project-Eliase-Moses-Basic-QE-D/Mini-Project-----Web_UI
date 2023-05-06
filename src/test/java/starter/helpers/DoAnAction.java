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
}
