package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;


public class AltaShopStepDefinitions  {
    Dotenv dotenv = Dotenv.load();
    @Given("{actor} is on Alta Shop page")
    public void userIsOnAltaShopPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaShopPage());
    }

    @And("{actor} input correct FullName {string}")
    public void userInputCorrectFullName(Actor actor, String FullName) {
        actor.attemptsTo(DoAnAction.fillFullNameFieldWithValue(dotenv.get(FullName)));
    }

    @And("{actor} input correct Email {string}")
    public void userInputCorrectEmail(Actor actor, String Email) {
        actor.attemptsTo(DoAnAction.fillEmailFieldWithValue(dotenv.get(Email)));
    }

    @And("{actor} input correct Password {string}")
    public void userInputCorrectPassword(Actor actor, String Password) {
        actor.attemptsTo(DoAnAction.fillPasswordFieldWithValue(dotenv.get(Password)));
    }

    @And("{actor} click register")
    public void userClickRegister(Actor actor) {
        actor.attemptsTo(DoAnAction.clickRegisterButton());
    }

    @Then("{actor} directed to login page")
    public void userDirectedToLoginPage(Actor actor) {
        Target loginTitle = Target.the("Login title")
                .located(By.xpath("//*[@id=\"app\"]/div"));
        actor.attemptsTo(WaitUntil.the(loginTitle, isCurrentlyVisible())
                .forNoMoreThan(Duration.ofSeconds(60)));

    }

    @And("{actor} click login")
    public void userClickLogin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLoginButton());
    }

    @Given("{actor} is on Alta Login Page")
    public void userIsOnAltaLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAltaLoginPage());
    }
    @And("{actor} input valid Email {string}")
    public void UserInputValidEmail(Actor actor, String Email) {
        actor.attemptsTo(DoAnAction.FillEmailFieldWithValue(dotenv.get(Email)));

    }

    @And("{actor} input valid Password {string}")
    public void UserInputValidPassword(Actor actor, String Password) {
        actor.attemptsTo(DoAnAction.FillPasswordFieldWithValue(dotenv.get(Password)));

    }

    @Then("{actor} directed to dashboard")
    public void userDirectedToDashboard(Actor actor) {
        Target dashboardpage = Target.the("dashboard")
                .located(By.xpath("//*[@id=\"app\"]/div"));
        actor.attemptsTo(WaitUntil.the(dashboardpage, isCurrentlyVisible())
                .forNoMoreThan(Duration.ofSeconds(60)));
    }

    @Then("{actor} selected category")
    public void userSelectedCategory(Actor actor) {
        Target category = Target.the("category")
                .located(By.xpath(""))
    }
}


