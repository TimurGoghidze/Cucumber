package Steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
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
        loginPage.sadMessage.shouldHave(text("Epic sadface: Sorry, this user has been locked out."));
    }

    @Then("^Error message$")
    public void errorMessage() {
        loginPage.sadMessage.shouldHave(text("Epic sadface: Username and password do not match any user in this service"));
        // loginPage.sadMessage.shouldHave(partialText(text("Epic sadface"));
    }

    @Then("^Receive a sad message with text \"([^\"]*)\"$")
    public void receiveASadMessageWithText(String errorMessageText) {
        loginPage.sadMessage.shouldHave(text(errorMessageText));

    }

    @When("^I enter \"([^\"]*)\" to userName input field$")
    public void iEnterToUserNameInputField(String userName)  {
        loginPage.usernameInputField.shouldBe(Condition.visible, Duration.ofSeconds(10)); // add time
        loginPage.usernameInputField.setValue(userName);
    }
    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(visible, Duration.ofSeconds(10));
    }
}

