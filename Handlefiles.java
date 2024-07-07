package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefiles {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.cssSelector("#uploadPicture"));
        element.sendKeys("C:\\Users\\wwwvu\\OneDrive\\Documents\\checkbox.txt");
    }
}