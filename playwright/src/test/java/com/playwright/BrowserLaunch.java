package com.playwright;

//import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserType;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.Playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        LaunchOptions lp = new  LaunchOptions();
        lp.setChannel("msedge");
        lp.setHeadless(false);
        Browser launch = playwright.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("http://www.facebook.com");

        page.close();
        playwright.close();



//     Playwright play = Playwright.create();
//        LaunchOptions lb = new LaunchOptions();
//        lb.setChannel("chrome");
//        lb.setHeadless(false);
//        Browser launch = play.chromium().launch(lb);
//        Page page = launch.newPage();
//        page.navigate("http://amazon.in");

    }
}
