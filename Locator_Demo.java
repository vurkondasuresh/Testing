package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Demo {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

WebDriver driver = new  ChromeDriver();
driver.get("https://www.linkedin.com/feed/");
driver.manage().window().maximize();
Thread.sleep(500);
driver.findElement(By.id("username")).sendKeys("Sureshvurkonda123@gmail.com");
driver.findElement(By.id("password")).sendKeys("@Suresh0209");
driver.findElement(By.name("agreeTerms")).click();
driver.findElement(By.xpath("(//button[text()='submit'])[1]")).click();
Thread.sleep(500); 
driver.quit();
    }
}
