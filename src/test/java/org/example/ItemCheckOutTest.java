package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ItemCheckOutTest
{
    WebDriver driver;
    @Test
    public void verifySavedDetailsTest() throws InterruptedException
    {
        driver=FactoryBrowser.setupBrowser("edge","https://www.ebay.com/signin/");
        ItemCheckOut SaveDetailUpdate=PageFactory.initElements(driver, ItemCheckOut.class);
        Thread.sleep(30000);
        SaveDetailUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        SaveDetailUpdate.con();
        Thread.sleep(30000);
        SaveDetailUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        SaveDetailUpdate.login();
        Thread.sleep(30000);
        SaveDetailUpdate.openCart();
        Thread.sleep(4000);
        SaveDetailUpdate.itemCheckout();
        Thread.sleep(4000);
        driver.quit();
    }
}