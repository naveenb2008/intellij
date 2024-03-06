package com.reusables;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Basereuseablecode {
    public static  void maximize(WebDriver driver){
        driver.manage().window().maximize();
    }
    public static  void minimize(WebDriver driver){
        driver.manage().window().minimize();
    }
    public static  void Url(WebDriver driver, String url){
        driver.get(url);
    }
    public static String gettext(WebElement element) {
        return element.getText();
    }
    public static  void sendelement(WebElement element,String input) {
        element.sendKeys(input);
    }
    public static  void click(WebElement Element){
        Element.click();
    }
    public static  void clear (WebElement element){
        element.clear();
    }
    public static  void isselected (WebElement element){
        element.isSelected();
    }
    public static  void isenabled (WebElement element){
        element.isEnabled();
    }
    public static  void isdisplayed (WebElement element){
        element.isDisplayed();
    }

    public static  void close(WebDriver driver){
        driver.close();
    }
    public static  void quit (WebDriver driver){
        driver.quit();
    }
    public static  void navigate_to (WebDriver driver, String url){
        driver.navigate().to(url);
    }
    public static  void navigate_back(WebDriver driver){
        driver.navigate().back();
    }
    public static  void forward (WebDriver driver){
        driver.navigate().forward();
    }
    public static  void refresh (WebDriver driver){
        driver.navigate().refresh();
    }
    public static  void selectByvalue (WebElement element, String Attributevalue ){
        Select s= new Select(element);
        s.selectByValue(Attributevalue);
    }
    public static  void selectByindex (WebElement element, int index ){
        Select s= new Select(element);
        s.selectByIndex(index);
    }
    public static  void selectByvissibleText (WebElement element, String Domtext ){
        Select s= new Select(element);
        s.selectByVisibleText(Domtext);
    }
    public static  void deselectbyvalue  (WebElement element, String Attributevalue ){
        Select s= new Select(element);
        s.deselectByValue(Attributevalue);
    }
    public static  void deselectbyindex  (WebElement element, int index ){
        Select s= new Select(element);
        s.deselectByIndex(index);
    }
    public static  void deselectbyvissibleText (WebElement element, String Domtext ){
        Select s= new Select(element);
        s.deselectByVisibleText(Domtext);
    }
    public static  void ismultipleDropdown (WebElement element){
        Select s= new Select(element);
        s.isMultiple();

    }
    public static  void getoptions (WebElement element){
        Select s= new Select(element);
        List<WebElement> options = s.getOptions();
        //  System.out.println();
    }
    public static  void getallselectedoptions (WebElement element){
        Select s= new Select(element);
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        //System.out.println();

    }
    public static  void getfirstselectoptions (WebElement element){
        Select s= new Select(element);
        WebElement firstSelectedOption = s.getFirstSelectedOption();
        //System.out.println();
    }
    public static void screenshot(WebDriver driver ,String filename) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screensource = ts.getScreenshotAs(OutputType.FILE);
        File filepath = new File("C:\\Users\\pragadeesh\\IdeaProjects\\IptProject\\takescreenshot\\" + filename + ".png");
        FileUtils.copyFile(screensource,filepath);
    }
    public  static  void simplealert(WebDriver driver){
        driver.switchTo().alert().accept();
    }
    public  static  void confirmalertaccept(WebDriver driver){
        driver.switchTo().alert().accept();
    }
    public  static  void confirmalertdismiss(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }
    public static void  scrolltowebelement( WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoview();",element);
    }
    public static void  scrolldown( WebDriver driver, WebElement element,int initial ,int finalvalue){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrolldown(initial ,finalvalue)");
    }
    public  static  void mouseclick(WebDriver driver, WebElement element){
        Actions ac =new Actions(driver);
        ac.click(element).build().perform();

    }
    public  static  void mouseRightclick(WebDriver driver, WebElement element){
        Actions ac =new Actions(driver);
        ac.contextClick(element).build().perform();
    }
    //public  static  void keyboard(String keys ) throws AWTException {
    //  Robot r =new Robot();
    //r.keyPress(KeyEvent  );
    //r.keyRelease(KeyEvent);
//}
    public  static  void  switchframebyindex(WebDriver driver, int index){
        driver.switchTo().frame(index);

    }
    public static void switchframebyid(WebDriver driver, String nameorid){
        driver.switchTo().frame(nameorid);
    }
    public static  void switchframebywebelement(WebDriver driver,WebElement webelementref){
        driver.switchTo().frame(webelementref);
    }
    public  static  void  defaultcontent(WebDriver driver){
        driver.switchTo().defaultContent();
    }
    public  static  void sleep(int millisecond) throws InterruptedException {
        Thread.sleep(millisecond);
    }
    public static void implicitwait(WebDriver driver, int seconda){
        driver.manage().timeouts().implicitlyWait(seconda, TimeUnit.SECONDS);
    }
    public  static  void explicitwait(WebDriver driver, Duration second, WebElement element ){
        WebDriverWait wait = new WebDriverWait(driver,second);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
