package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.desktop.QuitEvent;

public class Abox {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']/following-sibling::input[@id='name']")).sendKeys("Suresh");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#alertbtn")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']/following-sibling::input[@id='name']")).sendKeys("Vurkonda");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#confirmbtn")).click();
        Thread.sleep(5000);
        Alert confirmBtn = driver.switchTo().alert();
        Thread.sleep(5000);
        String confirmText = confirmBtn.getText();
        Thread.sleep(5000);
        System.out.println(confirmText);
        Thread.sleep(5000);
        alert.accept();
        driver.quit();
    }
}
