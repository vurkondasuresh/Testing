package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws Exception {
        /*
            Browser Setup
         */
        WebDriverManager.chromedriver().setup();
        /*
            create object for WebDriver Interface.
         */
        WebDriver driver = new ChromeDriver();
        /*
            Give the Website Link
         */
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        /*
        to maximize the Browser Screen
         */
        driver.manage().window().maximize();
        /*
            Thread to sleep Browser
         */
        Thread.sleep(5000);

      //driver.findElement(By.tagName("button")).click();
      //driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("Radio1")).click();
        driver.findElement(By.className("")).click();
        driver.findElement(By.className("\"form-label bodyMain p-b-0-xs m-b-2-xs")).click();


    }
}
