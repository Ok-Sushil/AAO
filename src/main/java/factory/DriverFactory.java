package factory;

import driver.ChromeDriverManager;
import driver.DriverManager;
import driver.FirefoxDriverManager;

public class DriverFactory {

    public static DriverManager getDriverManager(String browser) {
        return switch (browser.toLowerCase()) {
            case "chrome" -> new ChromeDriverManager();
            case "firefox" -> new FirefoxDriverManager();
            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
        };
    }
}
