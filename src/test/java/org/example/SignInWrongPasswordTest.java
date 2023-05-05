package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class SignInWrongPasswordTest
{
    WebDriver driver;
    @Test
    public void verifySignInWrongTest() throws InterruptedException
    { driver=FactoryBrowser.setupBrowser("chrome","https://www.ebay.com/signin/");
        SignInWrongPassword SignWrong=PageFactory.initElements(driver, SignInWrongPassword.class);
        Thread.sleep(30000);
        SignWrong.enterUsername("sushmabadhan98@gmail.com");
        Thread.sleep(2000);
        SignWrong.con();
        Thread.sleep(30000);
        SignWrong.enterPassword("Badhan123");
        Thread.sleep(2000);
        SignWrong.SignIn();
        Thread.sleep(30000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("Password not matched.");
    }
}
