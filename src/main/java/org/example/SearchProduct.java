package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SearchProduct
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
    public SearchProduct(WebDriver driver) {this.driver = driver;}
    public void enterUsername(String username){uname.sendKeys(username);}
    public void con(){cont.click();}
    public void enterPassword(String password){pass.sendKeys(password);}
    public void login(){loginButton.click();}
    public void typeSearch(String Search){searchBar.sendKeys(Search);}
    public void enterSearch(){searchButton.click();}
}