package com.pomforadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage
{
    WebDriver driver ;
    public BookAHotelPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//textarea[@name='address']")
    private WebElement Address;

    @FindBy(xpath = "//input[@name='cc_num']")
    private WebElement cardNumber;

    @FindBy(xpath = "//select[@name='cc_type']")
    private WebElement creditcardType;

    @FindBy(xpath = "//select[@name='cc_exp_month']")
    private WebElement expirymonth;

    @FindBy(xpath = "//select[@name='cc_exp_year']")
    private WebElement expiryyear;

    @FindBy(xpath = "//input[@name='cc_cvv']")
    private WebElement cvv;

    @FindBy(xpath = "//input[@id='book_now']")
    private  WebElement booknowbtn;

    @FindBy(xpath = "//input[@id='cancel']")
    private WebElement cancelBtn;



    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getAddress() {
        return Address;
    }

    public WebElement getCardNumber() {
        return cardNumber;
    }

    public WebElement getCreditcardType() {
        return creditcardType;
    }

    public WebElement getExpirymonth() {
        return expirymonth;
    }

    public WebElement getExpiryyear() {
        return expiryyear;
    }

    public WebElement getCvv() {
        return cvv;
    }

    public WebElement getBooknowbtn() {
        return booknowbtn;
    }

    public WebElement getCancelBtn() {
        return cancelBtn;
    }



}
