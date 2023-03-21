package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {
    public SelenideElement inventoryList  = $(byClassName("inventory_list"));
    public SelenideElement buttonFirstPurchases= $(byId("add-to-cart-sauce-labs-backpack"));
    public SelenideElement buttonCart = $(byClassName("shopping_cart_link"));
    public SelenideElement buttonCheckout = $(byId("checkout"));
    public SelenideElement fieldFirstName = $(byId("first-name"));

    public SelenideElement fieldLastName = $(byId("last-name"));

    public SelenideElement fieldZip_PostalCode = $(byId("postal-code"));
    public SelenideElement buttonContinue = $(byId("continue"));
    public SelenideElement buttonFinish = $(byId("finish"));

    public SelenideElement buttonBackHome = $(byId("back-to-products"));
    public SelenideElement messageCheckoutComplete = $(byClassName("complete-header"));

    public SelenideElement menuButton =  $(byId("react-burger-menu-btn"));
    public SelenideElement removeButtonBagPack =  $(byId("remove-sauce-labs-backpack"));
}
