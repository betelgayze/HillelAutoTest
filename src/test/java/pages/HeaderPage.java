package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HeaderPage {
    SelenideElement signInBtn = Selenide.$(".header_signin");
    SelenideElement navMenu = Selenide.$("#userNavDropdown");
    SelenideElement headLogout = Selenide.$x("//*[text()='Logout']");

    public LogInPopUp openLoginModal() {
        signInBtn.click();
        return new LogInPopUp();

    }
    public HomePage navMenuLogout(){
        navMenu.click();
        headLogout.click();
        return new HomePage();
    }
}
