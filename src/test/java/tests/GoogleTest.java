package tests;

import base.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseTest {

    @Test
    @Description("Verifies Google page title")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyGoogleTitle() {
        Allure.step("Open Google homepage");
        driver.get("https://www.google.com");

        GooglePage googlePage = new GooglePage(driver);
        String actualTitle = googlePage.getPageTitle();
        Allure.step("Verify that title contains 'Google'");
        Assert.assertTrue(actualTitle.contains("Google"), "Title doesn't match!");
    }
}
