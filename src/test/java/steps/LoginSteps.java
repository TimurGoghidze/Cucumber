package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends BaseSteps {

    @Given("^I open login page$")
    public void iOpenLoginPage() {
        open("https://www.saucedemo.com/");
    }


    @When("^I enter \"([^\"]*)\" to username input field$")
    public void iEnterToUsernameInputField(String usernameValue) {
        loginPage.usernameInputField.shouldBe(Condition.visible, Duration.ofSeconds(10)); // add time
        loginPage.usernameInputField.setValue(usernameValue);

    }

    @And("^enter \"([^\"]*)\" to password input filed$")
    public void enterToPasswordInputFiled(String passwordValue) {
        loginPage.passwordInputField.setValue(passwordValue);

    }

    @When("^I push the Login button$")
    public void iPushTheLoginButton() {
        loginPage.loginButton.shouldBe(enabled, Duration.ofSeconds(10)); // add 10 sec
        loginPage.loginButton.click(); //default selenide wait 4 seconds
    }

}

