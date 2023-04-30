package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RemoveCart
{
    WebDriver driver;
    @FindBy(xpath="//input[@id='userid']")
    WebElement uname;
    @FindBy(xpath= "//button[@id='signin-continue-btn']")
    WebElement cont;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement pass;
    @FindBy(xpath = "//button[@id='sgnBt']")

    WebElement signIButton;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[2]/a[1]")

    WebElement saved;
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-minicart-hover']/div[1]/a[1]/*[1]")

    WebElement cart;
    @FindBy(xpath = "//body/div[@id='cart-app']/div[@id='mainContent']/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/span[2]/button[1]")

    WebElement Remove;
    public RemoveCart(WebDriver driver) {this.driver = driver;}
    public void enterUsername(String username){uname.sendKeys(username);}
    public void con(){cont.click();}
    public void enterPassword(String password){pass.sendKeys(password);}
    public void signIn(){signIButton.click();}
    public void openCart(){cart.click();}
    public void itemRemove(){Remove.click();}
}

