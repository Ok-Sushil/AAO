package com.amazon.factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private WebDriverFactory wdf ;

    public WebDriver getDriver(String browser){

         switch (browser.toLowerCase()){
             case "chrome" :
                 wdf = new ChromeDriverImpl();
                 break;

             case "firefox" :
                 wdf = new FirefoxDriverImpl();
                 break;

             case "edge":
                 wdf = new EdgeDriverImpl();
                 break;

             default :
                 throw new IllegalArgumentException("Browser Not Supported" + browser);

         }





        return wdf.createDriver();
    }
}
