package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SavedDetails
{
    WebDriver driver;
    @FindBy(xpath="//input[@id='userid']")
    WebElement uname;
    @FindBy(xpath= "//button[@id='signin-continue-btn']")
    WebElement cont;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement pass;
    @FindBy(xpath = "//button[@id='sgnBt']")

    WebElement SignInButton;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[2]/a[1]")

    WebElement saved;
    public SavedDetails(WebDriver driver) {this.driver = driver;}
    public void enterUsername(String username){uname.sendKeys(username);}
    public void con(){cont.click();}
    public void enterPassword(String password){pass.sendKeys(password);}
    public void signIn(){SignInButton.click();}
    public void openSaved(){saved.click();}
}