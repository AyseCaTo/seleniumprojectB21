package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //System.setProperty("chrome","path of driver");

        //2- create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // maximize the browser
        driver.manage().window().maximize();

        //3- test if driver is working
        driver.get("https://www.google.com");

        System.out.println("Current title of page: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //we are using navigate.back method from SELENIUM LIBRARY
        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().to("https://www.tesla.com");

        System.out.println("Current title of page: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //closing the browser
        driver.close();
    }
}
