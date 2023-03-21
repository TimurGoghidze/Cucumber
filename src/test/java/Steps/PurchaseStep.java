package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ja.前提;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PurchaseStep extends BaseSteps{
    @And("^open side bar and push Reset App state$")
    public void open_side_bar_and_push_Reset_App_state()  {
        inventoryPage.menuButton.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.menuButton.click();
        sideBar.buttonResetAppState.shouldBe(enabled, Duration.ofSeconds(10));
        sideBar.buttonResetAppState.click();
    }

    @When("^I add first product to cart$")
    public void i_add_first_product_to_cart() {
        inventoryPage.buttonFirstPurchases.shouldBe(enabled, Duration.ofSeconds(10));
        inventoryPage.buttonFirstPurchases.click();

    }

    @Then("^cart icon with value \"([^\"]*)\" is displayed$")
    public void cart_icon_with_value_is_displayed(String quantity) {
        sideBar.purchaseInCart.shouldBe(enabled, Duration.ofSeconds(10));
        sideBar.purchaseInCart.shouldHave(text(quantity));

    }

    @And("^I push remote product and check that the cart is empty$")
    public void iPushRemoteProductAndCheckThatTheCartIsEmpty(String quantity) {
        inventoryPage.removeButtonBagPack.click();
        assertFalse(purchaseInCart.get)
        sideBar.purchaseInCart.shouldNotHave(text(quantity));
        sleep(3000);


    }
}
