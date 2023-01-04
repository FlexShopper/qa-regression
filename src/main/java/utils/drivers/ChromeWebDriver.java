package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class ChromeWebDriver {
    private static WebDriver driver;

    public static void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver loadChromeDriver(String chromeArgument) {
        setupChromeDriver();

        ChromeDriverService driverService = ChromeDriverService.createDefaultService();

        // Chrome needs to run in Headless mode in the Jenkins CI to solve error: "DevToolsActivePort file doesn't exist"
        ChromeOptions options = new ChromeOptions();
        // Following arguments were added to solve error: "DevToolsActivePort file doesn't exist"
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-setuid-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("start-maximized");
        options.addArguments(chromeArgument);

        driver = new ChromeDriver(driverService, options);
        return driver;
    }

    public static WebDriver loadChromeMobileEmulatorDriver(String chromeArgument) {
        setupChromeDriver();

        ChromeDriverService driverService = ChromeDriverService.createDefaultService();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone 12 Pro"); // iPhone SE - Model Name
        // Running Chrome in Headless mode to solve error: "DevToolsActivePort file doesn't exist"
        ChromeOptions options = new ChromeOptions().setHeadless(true);
        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        // Following arguments were added to solve error: "DevToolsActivePort file doesn't exist"
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-setuid-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("start-maximized");
        options.addArguments(chromeArgument);

        driver = new ChromeDriver(driverService, options);
        return driver;
    }
}
