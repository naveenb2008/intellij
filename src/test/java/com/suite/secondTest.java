package com.suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondTest {
    WebDriver driver;
     WebElement element;
    @Test
    public void  setup(){
         driver =new EdgeDriver();
        System.out.println("Edge is launched");
         driver.get("https://www.amazon.in/");
        System.out.println("navigate to  amazon");

    }
    @Test(dependsOnMethods = {"setup"})
    public void  clickminitv(){
          driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
          System.out.println("click the Minitv element");
    }

    @Test(dependsOnMethods = {"setup" },alwaysRun = true)
    public void clicksell(){
          driver.findElement(By.xpath("//a[text()='Sell']")).click();
          System.out.println("click the sell element");
    }
   @AfterTest
    public void close(){
        driver.close();
        System.out.println("close the Browser");
    }

}
