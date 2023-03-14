package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class StorePage {
    public SelenideElement buttonFirstPurchases= $(byId("add-to-cart-sauce-labs-backpack"));
    public SelenideElement buttonCart = $(byClassName("shopping_cart_link"));
    public SelenideElement buttonCheckout = $(byId("checkout"));

    public SelenideElement fieldFirstName = $(byId("first-name"));

    public SelenideElement fieldLastName = $(byId("last-name"));

    public SelenideElement fieldZip_PostalCode = $(byId("postal-code"));

    public SelenideElement buttonContinue = $(byId("continue"));

    public SelenideElement buttonFinish = $(byId("finish"));

    public SelenideElement messageCheckoutComplete = $(byClassName("complete-header"));

    }

