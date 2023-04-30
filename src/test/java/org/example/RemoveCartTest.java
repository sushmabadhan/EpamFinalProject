package org.example;
import com.browser.FactoryBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class RemoveCartTest
{
    WebDriver driver;
    @Test
    public void verifyRemoveCartTest() throws InterruptedException
    {
        driver=FactoryBrowser.setupBrowser("chrome","https://www.ebay.com/signin/");
        RemoveCart removeCartUpdate=PageFactory.initElements(driver, RemoveCart.class);
        Thread.sleep(30000);
        removeCartUpdate.enterUsername("sushmabadhan01@gmail.com");
        Thread.sleep(2000);
        removeCartUpdate.con();
        Thread.sleep(30000);
        removeCartUpdate.enterPassword("Badhan@123");
        Thread.sleep(2000);
        removeCartUpdate.signIn();
        Thread.sleep(30000);
        removeCartUpdate.openCart();
        Thread.sleep(2000);
        removeCartUpdate.itemRemove();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("Product removed successfully.");
    }
}