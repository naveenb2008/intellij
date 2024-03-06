package com.pomforadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel
{
    WebDriver driver;

    public SearchHotel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@name='location']")
    private WebElement location;

    @FindBy(xpath = "//select[@name='hotels']")
    private  WebElement hoteldrop;

    @FindBy(xpath = "//select[@name='room_type']")
    private  WebElement roomtypedrop;

    @FindBy(xpath = "//select[@name='room_nos']")
    private  WebElement noofroomtype;

    @FindBy(xpath = "//input[@name='datepick_in']")
    private  WebElement datein;

    @FindBy(xpath = "//input[@name='datepick_out']")
    private  WebElement dateout;

    @FindBy(xpath = "//select[@name='adult_room']")
    private WebElement adultperroom;

    @FindBy(xpath = "//select[@name='child_room']")
    private WebElement childperroom;

    @FindBy(xpath = "//input[@name='Submit']")
    private WebElement searchbtn;

    @FindBy(xpath = "//input[@id='Reset']")
    private WebElement resetbtn;

    public WebElement getLocation() {
        return location;
    }

    public WebElement getHoteldrop() {
        return hoteldrop;
    }

    public WebElement getRoomtypedrop() {
        return roomtypedrop;
    }

    public WebElement getNoofroomtype() {
        return noofroomtype;
    }

    public WebElement getDatein() {
        return datein;
    }

    public WebElement getDateout() {
        return dateout;
    }

    public WebElement getAdultperroom() {
        return adultperroom;
    }

    public WebElement getChildperroom() {
        return childperroom;
    }

    public WebElement getSearchbtn() {
        return searchbtn;
    }

    public WebElement getResetbtn() {
        return resetbtn;
    }
}
