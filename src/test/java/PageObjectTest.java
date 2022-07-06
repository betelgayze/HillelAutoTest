import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import pages.GaragePage;
import pages.HeaderPage;
import pages.HomePage;
import pages.LogInPopUp;

public class PageObjectTest {

    @Test
    public void canLogOutHeader() {
        //log in
        HomePage homePage = new HomePage();
        homePage.openPage();
        LogInPopUp logInPopUp = homePage.header.openLoginModal();
        GaragePage garagePage = logInPopUp.authorize(
                "pisnanastasiia+1@gmail.com",
                "Password1");
        //log out
        garagePage.header.navMenuLogout();
        //check
        Selenide.$(".header_signin").shouldBe(Condition.visible);
    }

    @Test
    public void canLogOutSide() {
        //log in
        HomePage homePage = new HomePage();
        homePage.openPage();
        LogInPopUp logInPopUp = homePage.header.openLoginModal();
        GaragePage garagePage = logInPopUp.authorize(
                "pisnanastasiia+1@gmail.com",
                "Password1");
        //log out
        garagePage.sideMenu.sideMenuLogout();
        //check
        Selenide.$(".header_signin").shouldBe(Condition.visible);


    }


    @Test
    public void canAddCar() {
        //login
        HomePage homePage = new HomePage();
        homePage.openPage();
        LogInPopUp logInPopUp = homePage.header.openLoginModal();
        GaragePage garagePage = logInPopUp.authorize(
                "pisnanastasiia+1@gmail.com",
                "Password1");

        //add car
        garagePage.addCar("1");

        Selenide.$x("//*[text()='Add fuel expense']").shouldBe(Condition.visible);
    }
}
