package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseTest {

    @Test
    public void verifyGoogleTitle() {
        driver.get("https://www.google.com");
        GooglePage googlePage = new GooglePage(driver);
        String actualTitle = googlePage.getPageTitle();
        Assert.assertTrue(actualTitle.contains("Google"), "Title doesn't match!");

    }
}
