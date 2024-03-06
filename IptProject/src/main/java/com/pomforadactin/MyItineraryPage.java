package com.pomforadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyItineraryPage {
    WebDriver driver;

    public MyItineraryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='my_itinerary']")
    private WebElement itinerarybtn;
@FindBy(xpath = "//input[@id='logout']")
    private WebElement logout;

    public WebElement getItinerarybtn() {
        return itinerarybtn;
    }

    public WebElement getLogout() {
        return logout;
    }
}

