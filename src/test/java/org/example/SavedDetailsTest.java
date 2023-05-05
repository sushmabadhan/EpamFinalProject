package org.example;
import com.browser.FactoryBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class SavedDetailsTest
{
    WebDriver driver;
    @Test
    public void verifySavedDetailsTest() throws InterruptedException
    {
        driver=FactoryBrowser.setupBrowser("chrome","https://www.ebay.com/signin/");
        SavedDetails SaveDetailUpdate=PageFactory.initElements(driver, SavedDetails.class);
        Thread.sleep(30000);
        SaveDetailUpdate.enterUsername("sushmabadhan98@gmail.com");
        Thread.sleep(2000);
        SaveDetailUpdate.con();
        Thread.sleep(30000);
        SaveDetailUpdate.enterPassword("sushma@123");
        Thread.sleep(2000);
        SaveDetailUpdate.signIn();
        Thread.sleep(30000);
        SaveDetailUpdate.openSaved();
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        System.out.println("Saved details opened successfully.");
    }
}
