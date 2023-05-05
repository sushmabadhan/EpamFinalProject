package org.example;
import com.browser.FactoryBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class SearchProductTest
{
    WebDriver driver;
    @Test
    public void verifySearch() throws InterruptedException
    { driver=FactoryBrowser.setupBrowser("chrome","https://www.ebay.com/signin/");
        SearchProduct SearchProductUpdate=PageFactory.initElements(driver, SearchProduct.class);
        Thread.sleep(30000);
        SearchProductUpdate.enterUsername("sushmabadhan98@gmail.com");
        Thread.sleep(2000);
        SearchProductUpdate.con();
        Thread.sleep(30000);
        SearchProductUpdate.enterPassword("sushma@123");
        Thread.sleep(2000);
        SearchProductUpdate.signIn();
        Thread.sleep(30000);
        SearchProductUpdate.typeSearch("apple laptop");
        Thread.sleep(2000);
        SearchProductUpdate.enterSearch();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("Product search done successfully.");
    }
}
