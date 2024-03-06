package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType .*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.MouseButton;

public class Actions {
    public static void main(String[] args) throws InterruptedException {
        Playwright play = Playwright.create();
        LaunchOptions launch = new LaunchOptions();
        launch.setChannel("chrome");
        launch.setHeadless(false);
        Browser brow = play.chromium().launch(launch);
        Page page = brow.newPage();
        page.navigate("https://www.amazon.in/");

       // move to the element

        //Locator  tv = page.locator("//a[text()='Amazon miniTV']");
        //tv.hover();

      //  page.hover("//a[text()='Amazon miniTV']");

        // Rightclick to a web element

       // Locator minitv = page.locator("//a[text()='Amazon miniTV']");
      //  minitv.click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));

        //Doubleclick
        //Locator tv = page.locator("//a[text()='Amazon miniTV']");
       // tv.dblclick();

        page.dblclick("//a[text()='Amazon miniTV']");

//page.close();
//play.close();
    }
}
