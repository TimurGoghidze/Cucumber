package Steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.assertTrue;

public class StoreSteps extends BaseSteps{

    @When("^Choose and click \"([^\"]*)\"$")
    public void choose_and_click()  {
        inventoryPage.buttonFirstPurchases.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.buttonFirstPurchases.click();


    }



    @And("^Click on button Checkout$")
    public void click_on_button_Checkout()  {
        inventoryPage.buttonCheckout.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.buttonCheckout.click();
    }

    @And("^Fill \"([^\"]*)\" \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fill(String arg0, String firstnameValue, String lastnameValue, String PostCodeValue)  {
        inventoryPage.fieldFirstName.shouldBe(Condition.visible, Duration.ofSeconds(10)); // add time
        inventoryPage.fieldFirstName.setValue(firstnameValue);
        inventoryPage.fieldLastName.setValue(lastnameValue);
        inventoryPage.fieldZip_PostalCode.setValue(PostCodeValue);
        inventoryPage.buttonContinue.click();
    }


    @And("^push the button Finish in Overview$")
    public void push_the_button_Finish_in_Overview()  {
        inventoryPage.buttonFinish.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.buttonFinish.click();
    }

    @Then("^Checkout: Complete! show message\"([^\"]*)\"$")
    public void checkout_Complete_show_message(String arg1)  {
        inventoryPage.buttonBackHome.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.messageCheckoutComplete.shouldHave(text(arg1));

    }


    @When("^Choose and click add to cart$")
    public void chooseAndClickAddToCart() {
        inventoryPage.buttonFirstPurchases.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.buttonFirstPurchases.click();
    }

    @And("^Click on cart$")
    public void clickOnCart() {
        inventoryPage.buttonCart.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.buttonCart.click();
    }
}