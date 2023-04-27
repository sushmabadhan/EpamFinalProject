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
    { driver=FactoryBrowser.setupBrowser("edge","https://www.ebay.com/signin/");
        SearchProduct SearchProductUpdate=PageFactory.initElements(driver, SearchProduct.class);
        Thread.sleep(20000);
        SearchProductUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        SearchProductUpdate.con();
        Thread.sleep(20000);
        SearchProductUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        SearchProductUpdate.login();
        Thread.sleep(20000);
        SearchProductUpdate.typeSearch("apple laptop");
        Thread.sleep(1000);
        SearchProductUpdate.enterSearch();
        Thread.sleep(1000);
        driver.quit();
        Thread.sleep(1000);
    }
}