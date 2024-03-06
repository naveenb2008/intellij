package com.playwright;

import com.microsoft.playwright.*;

public class WebTable {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
        BrowserType.LaunchOptions browser = new BrowserType.LaunchOptions();
        browser.setChannel("chrome");
        browser.setHeadless(false);
        Browser launch = play.chromium().launch(browser);
        Page page = launch.newPage();
        page.navigate("https://cosmocode.io/automation-practice-webtable/#google_vignette");
        //page.locator("//table[@id='countries']");
       // String s1 = page.textContent("//table/tbody/tr[2]/td");
        //System.out.println(s1);

       // String s = page.locator("//table/tbody/tr[2]/td").textContent();
        Locator locator = page.locator("//table/tbody/tr/td[4]");
        // String S2 = elementHandle.textContent();
        //System.out.println(S2);
        String s = locator.innerText();
        System.out.println(s);

       // System.out.println( s);

        //page.close();
        //play.close();
    }
}
