package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement usernameInputField = $(byId("user-name"));
    public SelenideElement passwordInputField = $(byId("password"));
    public SelenideElement loginButton =  $(byId("login-button"));
    public SelenideElement sadMessage = $(byTagName("h3"));

}
