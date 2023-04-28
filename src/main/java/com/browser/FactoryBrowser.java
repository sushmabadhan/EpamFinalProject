package com.browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FactoryBrowser {
    static WebDriver driver;
    public static WebDriver setupBrowser(String browser, String url)
    {
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}