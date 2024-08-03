package com.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowsHandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#openwindow")).click();
        System.out.println(driver.getTitle());
        String parentWindow = driver.getWindowHandle();
        System.out.println(driver.getCurrentUrl());
        Set<String> window = driver.getWindowHandles();
        System.out.println(window);
        for(String windows : window){
            if (!windows .equals(parentWindow) ) {
                  driver.switchTo().window(windows);
                System.out.println(driver.getTitle());
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
