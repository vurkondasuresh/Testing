package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleclickssendkeys {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        //Actions actions = new Actions(driver);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("#signInBtn"));
        javascriptExecutor.executeScript("arguments[0].click();",element);
        Thread.sleep(5000);
        javascriptExecutor.executeScript("document.getElementById('username').value='Suresh'");

    }
}
