package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        System.out.println("Current title of page: " + driver.getTitle());
    }
}

/*
TC #1: Facebook Title Verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: Facebook - Log In or Sign Up
 */
