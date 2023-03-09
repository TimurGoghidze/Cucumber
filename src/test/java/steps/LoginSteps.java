package steps;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class LoginSteps {
    @Given("^I open login page$")
    public void iOpenLoginPage() {
        open("https://www.saucedemo.com/");
    }
}
