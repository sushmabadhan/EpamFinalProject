package com.browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FactoryBrowser {
    static WebDriver driver;
    public static WebDriver setupBrowser(String browser, String url)
    {
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}