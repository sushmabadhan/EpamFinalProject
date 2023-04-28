package org.example;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AddtoCart
{
    WebDriver driver;
    @FindBy(xpath="//input[@id='userid']")
    WebElement uname;
    @FindBy(xpath= "//button[@id='signin-continue-btn']")
    WebElement cont;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement pass;
    @FindBy(xpath = "//button[@id='sgnBt']")
    WebElement loginButton;
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement searchBar;
    @FindBy(xpath = "//input[@id='gh-btn']")
    WebElement searchButton;
    @FindBy(xpath = "//li[@id='item4ddff99bb3']//div[@class='s-item__image-wrapper image-treatment']")
    WebElement searchItem;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addCart;
    public AddtoCart(WebDriver driver) {this.driver = driver;}

    public void enterUsername(String username){uname.sendKeys(username);}

    public void con(){cont.click();}

    public void enterPassword(String password){pass.sendKeys(password);}

    public void login(){loginButton.click();}
    public void typeSearch(String Search){searchBar.sendKeys(Search);}
    public void enterSearch(){searchButton.click();}
//    public void scrollDown() throws InterruptedException{
//    JavascriptExecutor scrollDn=(JavascriptExecutor)driver;
//    Thread.sleep(1000);
//    scrollDn.executeScript("window.scroll(0,500)");
//    Thread.sleep(1000);}
    public void searchProduct(){searchItem.click();}
    public void newTab() throws InterruptedException {
    String Tab= driver.getWindowHandle();
    Thread.sleep(1000);
    for (String newTab : driver.getWindowHandles())
    {if (!newTab.equals(Tab)) {driver.switchTo().window(newTab);break;}}}
    public void add(){addCart.click();}
}