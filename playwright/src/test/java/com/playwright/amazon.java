package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class amazon {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
        LaunchOptions lp = new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = play.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://www.amazon.in/");
    }
}
