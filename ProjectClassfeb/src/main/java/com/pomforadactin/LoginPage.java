package com.pomforadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public static WebDriver driver;
     public LoginPage(WebDriver driver) {
         this.driver = driver;
         PageFactory.initElements(driver, this);
     }

    @FindBy(xpath="//input[@id='username']")
    private WebElement username;


    @FindBy(xpath = "//input[@name='password']")
    private  WebElement password;

    @FindBy(xpath = "//input[@type='Submit']")
    private WebElement loginBtn ;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgotpwd;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getForgotpwd() {
        return forgotpwd;
    }

}
