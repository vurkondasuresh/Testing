package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Tabs {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a.btn-style")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String parentTab = driver.getWindowHandle();
        System.out.println(parentTab);
        Set<String> tabs = driver.getWindowHandles();
        System.out.println(tabs);
        for(String tab : tabs) {
            System.out.println(tab);
            if(!tab.equals(parentTab)){
                driver.switchTo().window(tab);
                Thread.sleep(5000);
                driver.close();
            }
        }

        driver.switchTo().window(parentTab);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();



    }
}
