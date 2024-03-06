package com.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pragadeesh\\IdeaProjects\\IptProject\\src\\test\\java\\com\\facebookfeature\\Facebook.feature",
        glue = "com.stepdefinitionfile" ,
        monochrome = true,
        dryRun = false,
        publish = true,
        plugin = {"html:Report/fb.html","pretty"})
public class RunnerclassforFb {

    public static WebDriver driver;
   @BeforeClass
    public static void start(){
        driver =new ChromeDriver();


    }
   @AfterClass
   public static void end(){
     driver.close();
    }
}
