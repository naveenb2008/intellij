package com.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Makeuppage {
    @FindBy(xpath = "//span[text()='allbeauty UK']")
    private WebElement sidername;

    @FindBy(xpath = "//button[@class='responsiveFlyoutMenu_menuButton']")
    private  WebElement hamburger_menu;

    @FindBy(xpath="//button[@class='headerSearch_toggleForm ']")
    private WebElement search_symbol;

    @FindBy(xpath = "//button[@class='responsiveAccountHeader_openAccountButtonMobile']")
    private WebElement Account_menu;
    @FindBy(xpath = "//button[@class='responsiveFlyoutBasket_openBasketButtonMobile']")
    private WebElement Basket_menu;

    @FindBy(xpath = "//button[@class='headerSearch_toggleForm headerSearch_toggleForm-open']")
    private  WebElement Search_barclose;
    @FindBy(xpath="//button[@class='responsiveFlyoutMenu_menuCross']")
    private WebElement hamburger_close;
    @FindBy(xpath = " //a[text()='Home']")
    private WebElement returntohomeoptins;
    @FindBy(xpath = " //a[contains(text(),'Save Up To 55% Off RRP On Our Special Offers')]")
     private WebElement flashmessage;



}
