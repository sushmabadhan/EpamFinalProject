package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ItemCheckOut
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

    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-minicart-hover']/div[1]/a[1]/*[1]")

    WebElement cart;
    @FindBy(xpath = "//button[contains(text(),'Go to checkout')]")

    WebElement checkOut;


    public ItemCheckOut(WebDriver driver) {this.driver = driver;}

    public void enterUsername(String username){uname.sendKeys(username);}

    public void con(){cont.click();}

    public void enterPassword(String password){pass.sendKeys(password);}

    public void login(){loginButton.click();}
    public void openCart(){cart.click();}
    public void itemCheckout(){checkOut.click();}
    }


