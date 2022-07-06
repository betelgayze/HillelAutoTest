package pages;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    public Notifications notifications;
    public BasePage(){
        this.notifications = new Notifications();
    }
    public void openPage(){
        open(
                "https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto"
        );
    }
    public HeaderPage header = new HeaderPage();
}
