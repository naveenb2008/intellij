package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public static WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement loginfield;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginbuttonfield;



    public WebElement getLoginfield() {
        return loginfield;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }
    public WebElement getLoginbuttonfield() {
        return loginbuttonfield;
    }

}
