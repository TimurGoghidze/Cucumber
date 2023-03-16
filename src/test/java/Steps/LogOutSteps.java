package Steps;

import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.SideBar;
import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;

public class LogOutSteps extends BaseSteps{
    @When("^I login  with data \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_login_with_data_and_password(String usernameValue, String passwordValue)  {

        loginPage.usernameInputField.shouldBe(Condition.visible, Duration.ofSeconds(10)); // add time
        loginPage.usernameInputField.setValue(usernameValue);
        loginPage.passwordInputField.setValue(passwordValue);
        loginPage.loginButton.shouldBe(enabled, Duration.ofSeconds(10)); // add 10 sec
        loginPage.loginButton.click();
    }

    @And("^I click on SideBar$")
    public void i_click_on_SideBar()  {

        inventoryPage.menuButton.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.menuButton.click();
    }

    @Then("^I click button Logout$")
    public void i_click_button_Logout()  {

       sideBar.logOutButton.shouldBe(enabled, Duration.ofSeconds(10));
        sideBar.logOutButton.click();
    }




}
