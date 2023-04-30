package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class SignOutPageTest {
    WebDriver driver;
    @Test( priority = 1 )
    public void verifySignOutTest() throws InterruptedException {
        driver = FactoryBrowser.setupBrowser("chrome", "https://www.ebay.com/signin/");
        SignOutPage signOutPageUpdate = PageFactory.initElements(driver, SignOutPage.class);
        Thread.sleep(30000);
        signOutPageUpdate.enterUsername("sushmabadhan01@gmail.com");
        Thread.sleep(2000);
        signOutPageUpdate.con();
        Thread.sleep(30000);
        signOutPageUpdate.enterPassword("Badhan@123");
        Thread.sleep(2000);
        signOutPageUpdate.signIn();
        Thread.sleep(30000);
        signOutPageUpdate.sighArrow();
        Thread.sleep(2000);
        signOutPageUpdate.signOut();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("SignOut done successfully.");
    }

}