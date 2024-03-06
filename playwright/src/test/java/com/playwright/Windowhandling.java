package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.util.List;

public class Windowhandling {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
         LaunchOptions Launch =new  LaunchOptions();
         Launch.setChannel("chrome");
         Launch.setHeadless(false);
        Browser brow = play.chromium().launch(Launch);
        Page page = brow.newPage();
        page.navigate("https://letcode.in/windows");
        String currtitle = page.title();
        System.out.println(currtitle);

        Locator homepagebtn = page.locator("//button[@id='home']");
        homepagebtn.click();
        page.waitForLoadState();
        List<Page> pages = page.context().pages();
        for ( Page currentpages:pages){

            if(currentpages.title().equals(currtitle)){
                continue;
            }else{
                currentpages.bringToFront();
                System.out.println(currentpages.title());
                break;
            }
        }

        //Page page1 = pages.get(1);
       // page1.bringToFront();
       // System.out.println(page1.title());
        page.close();
        play.close();

    }
}
