package com.cybertek.tests.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {
        //to setup chrome driver
        WebDriverManager.chromedriver().setup();
        //to create an object of ChromeDriver class
        ChromeDriver driver = new ChromeDriver();
        String url1 = "http://google.com";
        String url2 = "http://amazon.com";
        //will open browser with URL
        driver.get(url1);

        //will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //navigate to the Amazon.com
        driver.navigate().to(url2);

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        //will close web driver
        driver.close();


    }
}
