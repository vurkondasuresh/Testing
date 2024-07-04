package org.weblocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/descendant::input[@id='name']")).sendKeys("Suresh");
        driver.findElement(By.cssSelector("input#alertbtn")).click();
        Alert alert =driver.switchTo().alert();
        //String alertText = alert.getText();
        System.out.println(alert.getText());
        Thread.sleep(5000);
        alert.accept();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/descendant::input[@id='name']")).sendKeys("Vurkonda");
        driver.findElement(By.cssSelector("input#confirmbtn")).click();
        Alert confirmBtn = driver.switchTo().alert();
        Thread.sleep(5000);
        System.out.println(confirmBtn.getText());
        Thread.sleep(5000);
        alert.accept();
        driver.quit();
    }
}
