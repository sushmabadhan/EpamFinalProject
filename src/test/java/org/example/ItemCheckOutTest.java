package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ItemCheckOutTest
{
    WebDriver driver;
    @Test
    public void verifyCheckOutTest() throws InterruptedException
    {
        driver=FactoryBrowser.setupBrowser("chrome","https://www.ebay.com/signin/");
        ItemCheckOut checkOutUpdate=PageFactory.initElements(driver, ItemCheckOut.class);
        Thread.sleep(30000);
        checkOutUpdate.enterUsername("sushmabadhan98@gmail.com");
        Thread.sleep(2000);
        checkOutUpdate.con();
        Thread.sleep(30000);
        checkOutUpdate.enterPassword("sushma@123");
        Thread.sleep(2000);
        checkOutUpdate.signIn();
        Thread.sleep(30000);
        checkOutUpdate.openCart();
        Thread.sleep(2000);
        checkOutUpdate.itemCheckout();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("Checkout done successfully.");
    }
}
