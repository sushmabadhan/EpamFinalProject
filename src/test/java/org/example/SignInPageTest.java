package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class SignInPageTest {
    WebDriver driver;

    @Test
    public void VerifySignInTest() throws InterruptedException {
        driver = FactoryBrowser.setupBrowser("chrome", "https://www.ebay.com/signin/");
        SignInPage SignInPageUpdate = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(30000);
        SignInPageUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        SignInPageUpdate.con();
        Thread.sleep(30000);
        SignInPageUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        SignInPageUpdate.login();
        Thread.sleep(30000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("SignIn done successfully.");
    }
}