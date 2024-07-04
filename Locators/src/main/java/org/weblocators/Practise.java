package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("dropdown-class-example")).isSelected();
        //List<WebElement> elements =driver.findElements(By.id("dropdown-class-example"));
        //List<WebElement> elements = driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));
        //System.out.println(elements.size());
        
    }
}
