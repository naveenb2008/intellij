package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType .*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Facebook {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
 LaunchOptions lp =new  LaunchOptions();
 lp.setChannel("chrome");

        lp.setHeadless(false);
         play.chromium().launch(lp);
        Browser Browserlaunch = play.chromium().launch(lp);
        Page page = Browserlaunch.newPage();
        page.navigate("https://www.facebook.com/");
        Locator username = page.locator("//input[@type='text']");
        username.fill("naveen");
        Locator password = page.getByPlaceholder("Password");
        password.fill("asdfghdfg");
        Locator LoginButton = page.getByTestId("royal_login_button");
          LoginButton.click();
          page.close();
          play.close();

    }
}
