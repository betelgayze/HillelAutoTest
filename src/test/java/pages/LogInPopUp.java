package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LogInPopUp {
    SelenideElement emailInput = Selenide.$("#signinEmail");
    SelenideElement passwordInput = Selenide.$("#signinPassword");
    SelenideElement loginBtn = Selenide.$x("//*[text()='Login']");

    public GaragePage authorize(String email, String password) {
        emailInput.sendKeys("pisnanastasiia+1@gmail.com");
        passwordInput.sendKeys("Password1");
        loginBtn.click();
        return new GaragePage();
    }
}
