package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class LoginWrongTest
{
    WebDriver driver;
    @Test
    public void verifyLoginTest() throws InterruptedException
    { driver=FactoryBrowser.setupBrowser("crome","https://www.ebay.com/signin/");
        SignInWrongPassword logWrong=PageFactory.initElements(driver, SignInWrongPassword.class);
        Thread.sleep(20000);
        logWrong.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        logWrong.con();
        Thread.sleep(20000);
        logWrong.enterPassword("ani12");
        Thread.sleep(2000);
        logWrong.login();
        Thread.sleep(20000);
        driver.quit();

    }
}