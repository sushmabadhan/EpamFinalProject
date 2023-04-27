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
        driver=FactoryBrowser.setupBrowser("edge","https://www.ebay.com/signin/");
        SavedDetails SaveDetailUpdate=PageFactory.initElements(driver, SavedDetails.class);
        Thread.sleep(2000);
        SaveDetailUpdate.enterUsername("aniketkar96@gmail.com");
        Thread.sleep(2000);
        SaveDetailUpdate.con();
        Thread.sleep(2000);
        SaveDetailUpdate.enterPassword("aniket12");
        Thread.sleep(2000);
        SaveDetailUpdate.login();
        Thread.sleep(20000);
        SaveDetailUpdate.openSaved();
        Thread.sleep(2000);
        driver.quit();
    }
}