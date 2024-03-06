package com.pomforadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public WebDriver driver;
 public LogoutPage(WebDriver driver){
     this.driver=driver;
     PageFactory.initElements(driver,this);
 }

    @FindBy(xpath = "//input[@class='input_search']")
    private WebElement Searchidtextbox;


    @FindBy(xpath = "//input[@id='logout']")
    private WebElement loogoutBtn;

    public WebDriver getDriver() {
        return driver;
    }
    public WebElement getLoogoutBtn() {
        return loogoutBtn;
    }

}
