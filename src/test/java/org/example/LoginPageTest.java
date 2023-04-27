package org.example;
import com.browser.FactoryBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class LoginPageTest
{
    WebDriver driver;
    @Test
    public void verifyLoginTest() throws InterruptedException
    { driver=FactoryBrowser.setupBrowser("edge","https://www.ebay.com/signin/");
        LoginPage loginPageUpdate=PageFactory.initElements(driver, LoginPage.class);
        Thread.sleep(2000);
        loginPageUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        loginPageUpdate.con();
        Thread.sleep(2000);
        loginPageUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        loginPageUpdate.login();
        Thread.sleep(20000);
        driver.quit();

    }
}