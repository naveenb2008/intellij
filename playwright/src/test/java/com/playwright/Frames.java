package com.playwright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.*;

public class Frames {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
        LaunchOptions brow = new LaunchOptions();
        brow.setChannel("chrome");
        brow.setHeadless(false);
        Browser launch = play.chromium().launch(brow);
        Page page = launch.newPage();
        page.navigate("https://demo.automationtesting.in/Frames.html");

        // singleframe
       // FrameLocator frame = page.frameLocator("//iframe[@id='singleframe']");
      //  Locator textbox = frame.locator("//input[@type='text']");
        //textbox.fill("iframe");

        //multiple frame
        page.locator("//a[text()='Iframe with in an Iframe']").click();
        FrameLocator mainframe = page.frameLocator("//iframe[@src='MultipleFrames.html']");
        FrameLocator secondframe = mainframe.frameLocator("//iframe[@src='SingleFrame.html']");
        Locator textbox1 = secondframe.locator("//input[@type='text']");
        textbox1.fill("multiframe");
       // page.bringToFront();
       // page.bringToFront();


        page.locator("//a[text()='Home']").click();


    }   }

