package Steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
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

    @Then("^Receive a sad message$")
    public void receiveASadMessage() {
        loginPage.sadMessage.shouldBe(visible,Duration.ofSeconds(3));
        loginPage.sadMessage.shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
    }
}

