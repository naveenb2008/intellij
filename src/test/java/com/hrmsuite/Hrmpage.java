package com.hrmsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hrmpage {

    WebDriver driver;
    @Test(groups = {"smoke","regression","sanity"})
    public void setup1(){
        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test( priority = 2,groups = {"smoke","sanity"})
    public void login2() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Test(groups = {"smoke","regression"})
    public void  tearout3(){
        driver.close();

    }
}
