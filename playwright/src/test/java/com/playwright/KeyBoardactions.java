package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class KeyBoardactions {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
        LaunchOptions lo= new LaunchOptions();
        lo.setChannel("chrome");
        lo.setHeadless(false);
        Browser launch = play.chromium().launch(lo);
        Page page = launch.newPage();
        page.navigate("https://www.facebook.com/");

        //keyboard actons
        page.locator("//input[@type='text']");
        page.keyboard().press("KeyA");
        page.keyboard().type("naveen prabu");

        // move the function key
        page.keyboard().press("ArrowLeft");
        page.keyboard().press("Delete");

        Locator password = page.locator("//input[@type='password']");
        password.fill("3495943004");


        page.keyboard().down("Shift");
        for (int i = 0; i <"prabu".length() ; i++) {
            page.keyboard().press("ArrowLeft");
        }
        page.keyboard().up("Shift");
        page.keyboard().press("Backspace");
        page.keyboard().press("KeyA");

    }
}
