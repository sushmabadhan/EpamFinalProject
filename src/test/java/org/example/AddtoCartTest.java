package org.example;
import com.browser.FactoryBrowser;
import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class AddtoCartTest
{
    WebDriver driver;
    @Test
    public void verifySearch() throws InterruptedException
    { driver=FactoryBrowser.setupBrowser("crome","https://www.ebay.com/signin/");
        AddtoCart SearchProductUpdate=PageFactory.initElements(driver, AddtoCart.class);
        Thread.sleep(30000);
        SearchProductUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        SearchProductUpdate.con();
        Thread.sleep(30000);
        SearchProductUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        SearchProductUpdate.login();
        Thread.sleep(30000);
        SearchProductUpdate.typeSearch("Phone");
        Thread.sleep(1000);
        SearchProductUpdate.enterSearch();
        Thread.sleep(5000);
//        SearchProductUpdate.scrollDown();
//        Thread.sleep(5000);
        SearchProductUpdate.searchProduct();
        Thread.sleep(5000);
        SearchProductUpdate.newTab();
        Thread.sleep(5000);
        SearchProductUpdate.add();
        Thread.sleep(1000);
        driver.quit();
        Thread.sleep(1000);
    }
}