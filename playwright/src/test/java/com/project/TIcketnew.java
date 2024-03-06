package com.project;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TIcketnew {
    public static void main(String[] args) {
        Playwright key = Playwright.create();
        LaunchOptions browser =new LaunchOptions();
        browser.setChannel("chrome");
        browser.setHeadless(false);
        Browser chromebrowser = key.chromium().launch(browser);
        Page page = chromebrowser.newPage();
        page.navigate("https://ticketnew.com/movies/chennai");
        Locator searchMovieOrACinema = page.locator("//input[@type='search']");
        searchMovieOrACinema.fill("Vadakupatty Ramasamy");
        page.click("Search Movie or a Cinema");

        page.close();
        key.close();
    }
}
