package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SignOutPage
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
    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-eb-u']/button[@id='gh-ug']/b[2]")

    WebElement SignArrowButton;
    @FindBy(xpath = "//a[contains(text(),'Sign out')]")

    WebElement SignOutButton;

    public SignOutPage(WebDriver driver) {this.driver = driver;}
    public void enterUsername(String username){uname.sendKeys(username);}
    public void con(){cont.click();}
    public void enterPassword(String password){pass.sendKeys(password);}
    public void login(){loginButton.click();}
    public void sighArrow(){SignArrowButton.click();}
    public void signOut(){SignOutButton.click();}
}