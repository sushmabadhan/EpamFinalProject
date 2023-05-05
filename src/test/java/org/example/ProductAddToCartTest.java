package org.example;
import com.browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ProductAddToCartTest
{
    WebDriver driver;
    @Test
    public void verifyProductAddToCart() throws InterruptedException
    { driver=FactoryBrowser.setupBrowser("chrome","https://www.ebay.com/signin/");
        ProductAddToCart ProductAdd=PageFactory.initElements(driver, ProductAddToCart.class);
        Thread.sleep(30000);
        ProductAdd.enterUsername("sushmabadhan98@gmail.com");
        Thread.sleep(2000);
        ProductAdd.con();
        Thread.sleep(30000);
        ProductAdd.enterPassword("sushma@123");
        Thread.sleep(2000);
        ProductAdd.signIn();
        Thread.sleep(30000);
        ProductAdd.typeSearch("Phone");
        Thread.sleep(2000);
        ProductAdd.enterSearch();
        Thread.sleep(2000);
        ProductAdd.searchProduct();
        Thread.sleep(2000);
        ProductAdd.newTab();
        Thread.sleep(5000);
        ProductAdd.add();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("Product successfully add to cart.");
    }
}
