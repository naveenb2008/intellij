package com.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pragadeesh\\IdeaProjects\\IptProject\\src\\test\\java\\com\\facebookfeature\\Facebook.feature",
                        glue = "com.Stepdefinitionforfacebook" ,
                        monochrome = true,
                         dryRun = false,
        publish = true,
        plugin = {"html:Report/rep.html","pretty"})
public class AdactinRunner {
    public  static WebDriver driver;    //first the value is null// then assign to chromedriver
    @BeforeClass
    public static void start(){
        driver = new ChromeDriver();

    }
    @AfterClass
    public static void end(){

        driver.close();
        driver.quit();
    }


}
