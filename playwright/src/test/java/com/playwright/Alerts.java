package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Alerts {


    public static void main(String[] args) {
        Playwright play = Playwright.create();
        LaunchOptions launch= new LaunchOptions();
        launch.setChannel("chrome");
        launch.setHeadless(false);
        Browser brow = play.chromium().launch(launch);
        Page page = brow.newPage();
        page.navigate("https://demo.automationtesting.in/Alerts.html");


        page.onDialog(dialog -> {
            System.out.println(dialog.message());
            dialog.accept("naveen");
        });

        //simple alert
       // page.click("//button[@onclick='alertbox()']");

        // dismiss alert
        //Locator locator = page.locator("(//a[@class='analystic'])[2]");
      //  locator.click();
        //page.click("//button[text()='click the button to display a confirm box ']");

        //prompt alert
        page.locator("//a[text()='Alert with Textbox ']").click();
        page.click("//button[text()='click the button to demonstrate the prompt box ']");

        page.close();
        play.close();
    }
}
