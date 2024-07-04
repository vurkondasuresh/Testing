package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class Windows {
    public static void main(String[] args) throws Exception{
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//legend[text()='Switch Window Example']/following-sibling::button[@id='openwindow']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        Set<String> window = driver.getWindowHandles();
        System.out.println(window);
        Thread.sleep(5000);
        for(String windows :window){
            if (!windows.equals(parentWindow)){
                driver.switchTo().window(windows);
                Thread.sleep(5000);
                driver.close();
            }
        }
        Thread.sleep(5000);
        driver.switchTo().window(parentWindow);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
