package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Fruits {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("pi");
        Thread.sleep(5000);
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::p"));
        Thread.sleep(5000);
        System.out.println(products.size());

    }
}
