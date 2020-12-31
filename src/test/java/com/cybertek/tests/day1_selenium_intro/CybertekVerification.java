package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        System.out.println("Current title of page: " + driver.getTitle());
    }
}
/*
TC #2: Cybertek verifications
1. Open Chrome browser
2. Go to https://practice.cybertekschool.com
3. Verify URL contains
Expected: cybertekschool
4. Verify title:
 Expected: Practice
 */
