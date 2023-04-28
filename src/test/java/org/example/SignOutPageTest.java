package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class SignOutPageTest {
    WebDriver driver;

    @Test( priority = 1 )
    public void verifyLoginTest() throws InterruptedException {
        driver = FactoryBrowser.setupBrowser("crome", "https://www.ebay.com/signin/");
        SignOutPage loginPageUpdate = PageFactory.initElements(driver, SignOutPage.class);
        Thread.sleep(30000);
        loginPageUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        loginPageUpdate.con();
        Thread.sleep(30000);
        loginPageUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        loginPageUpdate.login();
        Thread.sleep(30000);
        loginPageUpdate.sighArrow();
        Thread.sleep(2000);
        loginPageUpdate.signOut();
        Thread.sleep(2000);
        driver.quit();
    }

}