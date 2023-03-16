package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class SideBar {
    public SelenideElement logOutButton = $(byId("logout_sidebar_link"));
    public SelenideElement buttonResetAppState = $(byId("reset_sidebar_link"));
    public SelenideElement purchaseInCart =$(byClassName("shopping_cart_badge"));
}
