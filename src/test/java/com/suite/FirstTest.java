package com.suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;
    @Test(priority = 1)
    public void  setup(){
         driver =new ChromeDriver();
        System.out.println("chrome is launched");
         driver.get("https://www.amazon.in/");
        System.out.println("navigate to  amazon");

    }
    @Test(priority = 2)
    public void  click(){
        driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
        System.out.println("click the web element");
    }
   @Test(priority = 3)
    public void close(){
        driver.close();
        System.out.println("close the Browser");
    }

}
