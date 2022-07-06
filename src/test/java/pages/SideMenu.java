package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SideMenu {
    public SelenideElement sideLogOut = Selenide.$(".icon-logout");

    public HomePage sideMenuLogout() {
        sideLogOut.click();
        return new HomePage();
    }
}
