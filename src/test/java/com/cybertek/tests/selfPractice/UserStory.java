package com.cybertek.tests.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class UserStory {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login2.nextbasecrm.com/");
        //driver.navigate().to();
        //driver.navigate().back();

        //Verification : getCurrentURL(); getTitle();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Authorization";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else{
            System.err.println("FAILED");
        }

        //look at this part

        //driver.findElement(By.linkText("Forgot your password?")).click();

        ArrayList<String> positiveUserNames = new ArrayList<String>(Arrays.asList("helpdesk25@cybertekschool.com",
                "helpdesk26@cybertekschool.com", "marketing25@cybertekschool.com",
                "marketing26@cybertekschool.com", "hr25@cybertekschool.com",
                "hr26@cybertekschool.com"));

        String password = "UserUser";

        for (String eachUser : positiveUserNames){
            driver.findElement(By.name("USER_LOGIN")).sendKeys(eachUser);

        }






    }
}
