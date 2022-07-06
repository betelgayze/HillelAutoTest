package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class GaragePage extends BasePage {
    public SideMenu sideMenu = new SideMenu();
    SelenideElement addCarBtn = Selenide.$x("//*[text()='Add car']");
    SelenideElement brandId = Selenide.$("#addCarBrand");
    SelenideElement modelId = Selenide.$("#addCarModel");
    SelenideElement carMileage = Selenide.$("#addCarMileage");
    public GaragePage addCar( String mileage) {
        addCarBtn.click();
        brandId.selectOption(2);
        modelId.click();
        modelId.selectOption(4);
        carMileage.click();
        carMileage.sendKeys("1");
        return this;
    }
}



