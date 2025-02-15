package pages;

import org.openqa.selenium.WebDriver;

public class GooglePage {
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
