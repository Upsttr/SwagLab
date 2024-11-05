package page_object.pom.pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {

    public LoginPage openPage() {
        open("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage enterUsername(String username) {
        $(byId("user-name")).setValue(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        $(byId("password")).setValue(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        $(byId("login-button")).click();
        return this;
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}


