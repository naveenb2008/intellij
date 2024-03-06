package com.pomforadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {
    WebDriver driver;

    public ConfirmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='radiobutton_0']")
    private WebElement radiobtn;

    @FindBy(xpath = "//input[@type='submit']")
     private  WebElement continuebtn;
    @FindBy(xpath = "//input[@id='cancel']")
    private  WebElement cancelBtn;

    public WebElement getRadiobtn() {
        return radiobtn;
    }

    public WebElement getContinuebtn() {
        return continuebtn;
    }

    public WebElement getCancelBtn() {
        return cancelBtn;
    }
}
