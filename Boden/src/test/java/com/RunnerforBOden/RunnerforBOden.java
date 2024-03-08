package com.RunnerforBOden;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\pragadeesh\\IdeaProjects\\Boden\\src\\test\\java\\com\\featurefile\\Boden.feature",
        glue = "com.stepDefinition",
        dryRun = false,
        monochrome = true,
        publish = true
)

public class RunnerforBOden {
    public  static WebDriver driver;
    @BeforeClass
    public static void start(){
        driver =new ChromeDriver();

    }
    @AfterClass
    public  static  void end(){
        driver.close();
        driver.quit();
    }

}
