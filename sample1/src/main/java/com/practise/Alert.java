package com.practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("https://rahulshettyacademy.com/AutomationPractice/")).sendKeys("Suresh");
        driver.findElement(By.cssSelector("#alertbtn")).click();
        /*org.openqa.selenium.Alert alert = driver.switchTo().alert();
        driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();*/
    }
}
