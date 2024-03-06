package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import javax.swing.text.html.Option;
import java.nio.file.Paths;

public class Drop_down {
    public static void main(String[] args) {
        Playwright Browser = Playwright.create();
        LaunchOptions lp =new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = Browser.chromium().launch(lp);
        Page page = launch.newPage();
 page.navigate("https://letcode.in/dropdowns");

 String single_dropdown ="//select[@id='fruits']";
 //String value="//option[text()='Banana']";
 page.selectOption(single_dropdown,"Banana");
 page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\pragadeesh\\IdeaProjects\\playwright\\src\\test\\screenshot\\singledropdown.png")));

 String fruits="//select[@id='superheros']";
 String [] superheros={"Aquaman","Batman"};
 page.selectOption(fruits,superheros);

        ElementHandle options = page.querySelector("//option[@value='bp']");
        Object evaluate = options.evaluate("eh=>eh.selected");
       System.out.println(evaluate);
    page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\pragadeesh\\IdeaProjects\\playwright\\src\\test\\screenshot\\drop.png")));
        page.close();
Browser.close();
    }
}
